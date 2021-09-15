package cn.acfun.springcloudproducer.controller;


import cn.acfun.springcloud.dto.Result;
import cn.acfun.springcloudproducer.domain.Order;
import cn.acfun.springcloudproducer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/list/{orderId}")
    public Result getOrderList(@PathVariable(value = "orderId") String orderId){
        List<Order> orderList = orderService.getOrderList(orderId);
        return  new Result("200", "查询成功", orderList);
    }


}

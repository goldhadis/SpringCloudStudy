package cn.acfun.springcloudcustomer.controller;

import cn.acfun.springcloud.dto.Result;
import cn.acfun.springcloudcustomer.service.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProducerFeignController {

    @Resource
    private ProducerService producerService;


    @GetMapping("/producer/get/info")
    public Result getServiceInfo(){
        return producerService.getServiceInfo();
    }

    @GetMapping("/cuorder/list/{orderId}")
    public Result getOrderInfo(@PathVariable("orderId") String orderId){
        System.out.println(producerService.getOrderList(orderId));
        return producerService.getOrderList(orderId);
    }
}

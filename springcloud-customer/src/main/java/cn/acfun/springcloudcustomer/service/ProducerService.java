package cn.acfun.springcloudcustomer.service;

import cn.acfun.springcloud.dto.Result;
import cn.acfun.springcloudcustomer.service.impl.ProducerFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "producer-order", fallback = ProducerFallbackImpl.class)
public interface ProducerService {

    /**
     *
     * @return 通用返回结果
     */

    @GetMapping("/provider/get/info")
    public Result getServiceInfo();


    @GetMapping("/order/list/{orderId}")
    public Result getOrderList(@PathVariable(value = "orderId") String orderId);
}

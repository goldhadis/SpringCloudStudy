package cn.acfun.springcloudcustomer.service.impl;

import cn.acfun.springcloud.dto.Result;
import cn.acfun.springcloudcustomer.service.ProducerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProducerFallbackImpl implements ProducerService{
    @Override
    public Result getServiceInfo() {
        return new Result("500", "服务器内部出现错误", null);
    }

    @Override
    public Result getOrderList(String orderId) {
        return new Result("400", "获取订单错误，订单不存在", null);
    }
}

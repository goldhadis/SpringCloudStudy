package cn.acfun.springcloudproducer.service.impl;

import cn.acfun.springcloudproducer.domain.Order;
import cn.acfun.springcloudproducer.mapper.OrderMapper;
import cn.acfun.springcloudproducer.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public List<Order> getOrderList(String orderId) {
        return orderMapper.getOrderList(orderId);
    }

}

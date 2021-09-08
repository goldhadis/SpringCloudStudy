package cn.acfun.springcloudproducer.service;

import cn.acfun.springcloudproducer.domain.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList(String orderId);
}

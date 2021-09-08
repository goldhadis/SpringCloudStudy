package cn.acfun.springcloudproducer.mapper;

import cn.acfun.springcloudproducer.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    List<Order> getOrderList(String orderId);
}

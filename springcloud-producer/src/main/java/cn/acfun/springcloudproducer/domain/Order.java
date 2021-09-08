package cn.acfun.springcloudproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Long orderId;

    private String orderName;

    private String orderMount;

    private String createTime;

    private String createBy;

    private String updateTime;

    private String updateBy;
}

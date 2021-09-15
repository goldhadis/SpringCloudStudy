package cn.acfun.springcloudproducer.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result {

    private String retCode;

    private String retMsg;

    private Object data;
}

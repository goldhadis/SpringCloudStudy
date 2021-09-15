package cn.acfun.springcloudproducer.controller;
import cn.acfun.springcloud.dto.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRibbonController {


    @Value("${spring.application.name}")
    private String instantName;

    @Value("${server.port}")
    private String port;
    @GetMapping("/provider/get/info")
    public Result getServiceInfo(){
        return new Result("200", "查询成功", "当前服务名：  "+instantName+",当前端口："+port);
    }
}

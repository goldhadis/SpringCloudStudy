package cn.acfun.springcloudcustomeroauth2server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("cn.acfun.springcloudcustomeroauth2server.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudCustomerOauth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudCustomerOauth2ServerApplication.class, args);
    }

}

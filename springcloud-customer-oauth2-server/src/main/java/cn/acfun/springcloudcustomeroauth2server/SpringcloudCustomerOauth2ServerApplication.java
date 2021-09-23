package cn.acfun.springcloudcustomeroauth2server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("cn.acfun.springcloudcustomeroauth2server.mapper")
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudCustomerOauth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudCustomerOauth2ServerApplication.class, args);
    }

}

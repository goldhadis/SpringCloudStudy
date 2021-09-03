package cn.acfun.springcloudcustomerserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("cn.acfun.springcloudcustomerserver.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudCustomerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudCustomerServerApplication.class, args);
    }

}

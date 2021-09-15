package cn.acfun.springcloudcustomer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.acfun.springcloudproducer.mapper")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "cn.acfun.springcloudcustomer")
@EnableFeignClients("cn.acfun.springcloudcustomer.service")
@EnableCircuitBreaker
public class SpringcloudCustomerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringcloudCustomerApplication.class, args);
    }

}

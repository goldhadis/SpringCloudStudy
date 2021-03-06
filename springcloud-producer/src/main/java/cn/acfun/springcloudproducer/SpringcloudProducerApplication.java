package cn.acfun.springcloudproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.acfun.springcloudproducer.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudProducerApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducerApplication.class, args);
    }

}

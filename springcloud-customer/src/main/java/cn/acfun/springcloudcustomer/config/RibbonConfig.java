package cn.acfun.springcloudcustomer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * Ribbon配置类
 *
 */

@Configuration
public class RibbonConfig {


    @Bean
    @LoadBalanced
    public RestTemplate  getRestTemplate(){
        return new RestTemplate();
    }
}

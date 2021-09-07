package cn.acfun.springcloudadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAdminServerApplication.class, args);
    }

}

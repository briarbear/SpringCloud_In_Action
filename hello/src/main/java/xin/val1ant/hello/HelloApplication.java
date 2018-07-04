package xin.val1ant.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// @EnableDiscoveryClient 注解， 激活 Eureka 中的 DiscoveryClient 实现
@EnableDiscoveryClient
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}

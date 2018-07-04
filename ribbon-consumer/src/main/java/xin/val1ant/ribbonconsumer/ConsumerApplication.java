package xin.val1ant.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //让该应用注册为 Eureka客户端应用， 以获得服务发现的能力
public class ConsumerApplication {


    //创 建RestTemplate的 Spring Bean 实例
    @Bean
    @LoadBalanced  // 注解开启客户端 负载均衡。

    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}

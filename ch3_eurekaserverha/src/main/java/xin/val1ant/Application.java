package xin.val1ant;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 *
 * @auther Val1ant
 * @blog http://www.val1ant.xin
 * @create 2018-05-20-18:05
 */
@EnableEurekaServer
@SpringBootApplication

public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}

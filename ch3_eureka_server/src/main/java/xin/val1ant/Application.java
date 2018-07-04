package xin.val1ant;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 *
 * @auther Val1ant
 * @blog http://www.val1ant.xin
 * @create 2018-05-20-13:08
 */
@SpringBootApplication
@EnableEurekaServer //注解启动一个服务注册中心提供给其他应用进行对话。
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}


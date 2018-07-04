package xin.val1ant.ribbonconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 控制器
 *
 * @auther Val1ant
 * @blog http://www.val1ant.xin
 * @create 2018-06-03-23:26
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    RestTemplate restTemplate;

    /**
     * 对HelloServie服务进行调用 地址是服务名
     * @return
     */
    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
//        return helloService.hello();
        //第一种调用GET请求的方式 getForEntity 函数
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

}

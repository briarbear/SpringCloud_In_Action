package xin.val1ant.hello.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 控制器
 *
 * @auther Val1ant
 * @blog http://www.val1ant.xin
 * @create 2018-05-17-9:58
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client; //过注入 DiscoveryClient 对象， 在日志中打 印出服务的相关内容。
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());

        return "Hello World";
    }
}

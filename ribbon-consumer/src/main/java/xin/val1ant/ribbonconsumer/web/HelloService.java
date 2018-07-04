package xin.val1ant.ribbonconsumer.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @auther Val1ant
 * @blog http://www.val1ant.xin
 * @create 2018-06-03-23:28
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String hello(){
        long start = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();

        //GET请求 使用getForEntity函数
        result.append(restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody()).append("<br>");
        result.append(restTemplate.getForEntity("http://HELLO-SERVICE/hello1?name={1}", String.class, "didi").getBody()).append("<br>");

        //若我们希望返回的 body是一个 User对象类型， 也可以这样实现：
        ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://USER-SERVICE/user?name={1}",User.class,"didi");
        User body = responseEntity.getBody();
    }

}

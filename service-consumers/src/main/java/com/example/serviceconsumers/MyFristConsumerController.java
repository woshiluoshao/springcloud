package com.example.serviceconsumers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFristConsumerController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MyFristConsumer myFristConsumer ;
    /**
     * 我的第一个微服务调用程序
     * @param name
     * @return
     */
    @RequestMapping(value="/consumerHelloWorld" , method= RequestMethod.GET)
    public String helloWorld(String name) {
        String result = myFristConsumer.helloWorld(name)  + ";your port is:" + port;

        System.out.println("消费者:" + result);
        return  result;
    }
}

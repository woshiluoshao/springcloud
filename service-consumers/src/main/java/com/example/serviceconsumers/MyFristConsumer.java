package com.example.serviceconsumers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-provider", fallback = MyFirstCustomerHystrix.class)
public interface MyFristConsumer {
    /**
     * 远程调用helloWorld的接口
     * @param name
     * @return
     */
    @RequestMapping(value="/helloWorld" , method= RequestMethod.GET)
    public String helloWorld(@RequestParam("name") String name) ;
}

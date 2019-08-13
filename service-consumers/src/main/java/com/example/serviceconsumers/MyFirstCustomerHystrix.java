package com.example.serviceconsumers;

import org.springframework.stereotype.Component;

@Component
public class MyFirstCustomerHystrix implements MyFristConsumer{

    @Override
    public String helloWorld(String name) {
        return "your message is failure!";
    }
}

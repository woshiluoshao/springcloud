package com.example.serviceprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstProviderController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String helloWorld(@RequestParam("name") String name) {

        return "hello," + name + ", how are you ? 过得怎么样";
    }
}

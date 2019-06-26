package com.zzy.service.impl;

import com.zzy.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello World!";
    }
}

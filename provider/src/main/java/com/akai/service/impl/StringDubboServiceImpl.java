package com.akai.service.impl;

import com.akai.service.StringDubboService;
import org.apache.dubbo.config.annotation.Service;

/*service注解使用的是 apache，不是 spring*/
/*有了该注解 dubbo就会把 service在注册中心注册，供外界调用*/
@Service
public class StringDubboServiceImpl implements StringDubboService {
    @Override
    public String hello(String name) {
        System.out.println("hello " + name + "~");
        return "hello " + name + "~";
    }
}

package com.akai.service.impl;

import com.akai.service.StringDubboService;
import com.akai.service.StringService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService {

    /*这里不使用 autowired*/
    @Reference
    private StringDubboService dubboService;

    @Override
    public String getString() {
        return dubboService.hello("shiho");
    }
}

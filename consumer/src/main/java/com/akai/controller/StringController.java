package com.akai.controller;

import com.akai.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class StringController {

    @Autowired
    private StringService stringService;

    @RequestMapping("/getString")
    public String getString() {
        return stringService.getString();
    }
}

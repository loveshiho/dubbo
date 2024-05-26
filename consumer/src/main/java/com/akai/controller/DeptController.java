package com.akai.controller;

import com.akai.pojo.Dept;
import com.akai.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/list")
    public List<Dept> queryAll(@RequestBody Dept dept) {
        return deptService.queryAll(dept);
    }

    @GetMapping("/{deptno}")
    public Dept queryById(@PathVariable("deptno") Integer deptno) {
        return deptService.queryById(deptno);
    }
}

package com.akai.service.impl;

import com.akai.pojo.Dept;
import com.akai.service.DeptDubboService;
import com.akai.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Reference
    private DeptDubboService dubboService;

    @Override
    public List<Dept> queryAll(Dept dept) {
        return dubboService.queryAll(dept);
    }

    @Override
    public Dept queryById(Integer deptno) {
        return dubboService.queryById(deptno);
    }
}

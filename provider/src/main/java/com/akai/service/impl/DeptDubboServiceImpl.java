package com.akai.service.impl;

import com.akai.mapper.DeptMapper;
import com.akai.pojo.Dept;
import com.akai.service.DeptDubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class DeptDubboServiceImpl implements DeptDubboService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> queryAll(Dept dept) {
        return deptMapper.queryAll(dept);
    }

    @Override
    public Dept queryById(Integer deptno) {
        return deptMapper.queryById(deptno);
    }
}

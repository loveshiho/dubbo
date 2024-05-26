package com.akai.service;

import com.akai.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> queryAll(Dept dept);
    Dept queryById(Integer deptno);
}

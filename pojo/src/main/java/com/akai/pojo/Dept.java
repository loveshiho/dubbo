package com.akai.pojo;

import java.io.Serializable;

/**
 * (Dept)实体类
 *
 * @author makejava
 * @since 2024-05-26 15:17:12
 */
public class Dept implements Serializable {
    private static final long serialVersionUID = 217747488924736482L;

    private Integer deptno;

    private String dname;

    private String loc;


    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}


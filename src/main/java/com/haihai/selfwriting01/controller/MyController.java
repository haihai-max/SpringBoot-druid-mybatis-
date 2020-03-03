package com.haihai.selfwriting01.controller;

import com.haihai.selfwriting01.bean.Emp;
import com.haihai.selfwriting01.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    EmpMapper empMapper;

    @ResponseBody
    @RequestMapping("/emp/{eid}")
    public Emp selectEmpById(@PathVariable("eid") int eid){
        return empMapper.selectEmpById(eid);
    }

    @RequestMapping("/insert")
    public void insertByEmp(){
        Emp emp=new Emp(1999,"haihai");
        int i = empMapper.insertByEmp(emp);
        System.out.println(i);
    }

    @RequestMapping("/delete/{eid}")
    public void deleteById(@PathVariable("eid") int eid){
        int i = empMapper.deleteById(eid);
        System.out.println(i);
    }

    @RequestMapping("/update")
    public void updateByEmp(){
        Emp emp=new Emp(18,"111111");
        int i = empMapper.updateByEmp(emp);
        System.out.println(i);
    }
}

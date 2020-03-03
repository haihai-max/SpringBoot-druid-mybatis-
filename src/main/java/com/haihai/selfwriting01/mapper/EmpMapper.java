package com.haihai.selfwriting01.mapper;

import com.haihai.selfwriting01.bean.Emp;

public interface EmpMapper {

    //根据Id查一个emp
    Emp selectEmpById(int eid);

    //插入一个emp
    int insertByEmp(Emp emp);

    //删除一个emp
    int deleteById(int eid);

    //更新一个emp
    int updateByEmp(Emp emp);

}

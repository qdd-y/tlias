package cn.qdd.tlias.service;

import cn.qdd.tlias.pojo.Dept;

import java.util.List;

/**
 * @Author: qdd
 * @Description: IDeptService
 * @DateTime: 2026/3/28 11:24
 **/
public interface IDeptService {

    List<Dept> findAll();

    void delete(Integer deptId);


    void insert(Dept dept);

    Dept getById(Integer id);

    void update(Dept dept);
}

package cn.qdd.tlias.service;

import cn.qdd.tlias.pojo.Emp;
import cn.qdd.tlias.pojo.EmpQueryParam;
import cn.qdd.tlias.pojo.PageResult;

import java.util.List;

/**
 * @Author: qdd
 * @Description: IEmpService
 * @DateTime: 2026/3/28 14:36
 **/
public interface IEmpService {
    Emp login(Emp emp);

    /**
     * 分页查询
     */
    //PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    PageResult page(EmpQueryParam empQueryParam);

    void save(Emp emp);

    void deleteByIds(List<Integer> ids);

    Emp getInfo(Integer id);

    void update(Emp emp);
}

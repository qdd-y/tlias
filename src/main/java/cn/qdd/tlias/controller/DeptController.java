package cn.qdd.tlias.controller;

import cn.qdd.tlias.pojo.Dept;
import cn.qdd.tlias.pojo.Result;
import cn.qdd.tlias.service.impl.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: qdd
 * @Description: DeptCoontroller
 * @DateTime: 2026/3/28 11:23
 **/
@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询部门列表
     */
    @GetMapping("/depts")
    public Result list(){
        log.info("查询部门列表");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

    /**
     * 删除部门
     */
    @DeleteMapping("/depts")
    public Result delete(@RequestParam("id") Integer deptId){
        log.info("删除部门，id={}",deptId);
        try {
            deptService.delete(deptId);
            return Result.success();
        } catch (RuntimeException e) {
            return Result.error(e.getMessage());
        }
    }

    /**
     * 新增部门 - POST http://localhost:8080/depts   请求参数：{"name":"研发部"}
     */
    @PostMapping("/depts")
    public Result save(@RequestBody Dept dept){
        log.info("新增部门，dept={}",dept);
        deptService.insert(dept);
        return Result.success();
    }

    /**
     * 根据ID查询 - GET http://localhost:8080/depts/1
     */
    @GetMapping("/depts/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据ID查询部门，id={}",id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /**
     * 修改部门 - PUT http://localhost:8080/depts  请求参数：{"id":1,"name":"研发部"}
     */
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
        log.info("修改部门，dept={}",dept);
        deptService.update(dept);
        return Result.success();
    }
}

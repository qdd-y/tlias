package cn.qdd.tlias.controller;

import cn.qdd.tlias.pojo.JobOption;
import cn.qdd.tlias.pojo.Result;
import cn.qdd.tlias.pojo.StudentCountOption;
import cn.qdd.tlias.service.IReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author: qdd
 * @Description: ReportController
 * @DateTime: 2026/3/28 16:36
 **/
@Slf4j
@RequestMapping("/report")
@RestController
public class ReportController {

    @Autowired
    private IReportService reportService;

    /**
     * 统计各个职位的员工人数
     */
    @GetMapping("/empJobData")
    public Result getEmpJobData(){
        log.info("统计各个职位的员工人数");
        JobOption jobOption = reportService.getEmpJobData();
        return Result.success(jobOption);
    }

    /**
     * 统计员工性别信息
     */
    @GetMapping("/empGenderData")
    public Result getEmpGenderData(){
        log.info("统计员工性别信息");
        List<Map> genderList = reportService.getEmpGenderData();
        return Result.success(genderList);
    }

    /**
     * 统计班级人数信息
     */
    @GetMapping("/studentCountData")
    public Result getStudentCountData(){
        log.info("统计班级人数信息");
        StudentCountOption studentCountOption = reportService.getStudentCountData();
        return Result.success(studentCountOption);
    }

    /**
     * 统计学员学历信息
     */
    @GetMapping("/studentDegreeData")
    public Result getStudentDegreeData(){
        log.info("统计学员学历信息");
        List<Map> degreeList = reportService.getStudentDegreeData();
        return Result.success(degreeList);
    }
}
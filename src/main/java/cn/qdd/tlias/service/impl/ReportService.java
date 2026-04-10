package cn.qdd.tlias.service.impl;

import cn.qdd.tlias.mapper.EmpMapper;
import cn.qdd.tlias.mapper.StudentMapper;
import cn.qdd.tlias.pojo.JobOption;
import cn.qdd.tlias.pojo.StudentCountOption;
import cn.qdd.tlias.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: qdd
 * @Description: ReportService
 * @DateTime: 2026/3/28 16:36
 **/
@Service
public class ReportService implements IReportService {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public JobOption getEmpJobData() {
        List<Map<String,Object>> list = empMapper.countEmpJobData();
        List<Object> jobList = list.stream().map(dataMap -> dataMap.get("pos")).toList();
        List<Object> dataList = list.stream().map(dataMap -> dataMap.get("total")).toList();
        return new JobOption(jobList, dataList);
    }

    @Override
    public List<Map> getEmpGenderData() {
        return empMapper.countEmpGenderData();
    }

    @Override
    public StudentCountOption getStudentCountData() {
        List<Map<String,Object>> list = studentMapper.countStudentByClazz();
        List<Object> clazzList = list.stream().map(dataMap -> dataMap.get("clazzName")).toList();
        List<Object> dataList = list.stream().map(dataMap -> dataMap.get("total")).toList();
        return new StudentCountOption(clazzList, dataList);
    }

    @Override
    public List<Map> getStudentDegreeData() {
        return studentMapper.countStudentDegreeData();
    }
}

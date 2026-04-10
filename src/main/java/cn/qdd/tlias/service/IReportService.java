package cn.qdd.tlias.service;

import cn.qdd.tlias.pojo.JobOption;
import cn.qdd.tlias.pojo.StudentCountOption;

import java.util.List;
import java.util.Map;

/**
 * @Author: qdd
 * @Description: IReportService
 * @DateTime: 2026/3/28 16:36
 **/
public interface IReportService {
    JobOption getEmpJobData();

    List<Map> getEmpGenderData();

    StudentCountOption getStudentCountData();

    List<Map> getStudentDegreeData();

}

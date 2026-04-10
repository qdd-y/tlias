package cn.qdd.tlias.service;

import cn.qdd.tlias.pojo.PageResult;
import cn.qdd.tlias.pojo.Student;
import cn.qdd.tlias.pojo.StudentQueryParam;

public interface IStudentService {
    PageResult page(StudentQueryParam studentQueryParam);

    Student getById(Integer id);

    void save(Student student);

    void update(Student student);

    void deleteById(Integer id);
}

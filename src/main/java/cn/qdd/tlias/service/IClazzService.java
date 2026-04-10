package cn.qdd.tlias.service;

import cn.qdd.tlias.pojo.Clazz;
import cn.qdd.tlias.pojo.ClazzQueryParam;
import cn.qdd.tlias.pojo.PageResult;

public interface IClazzService {
    PageResult page(ClazzQueryParam clazzQueryParam);

    Clazz getById(Integer id);

    void save(Clazz clazz);

    void update(Clazz clazz);

    void deleteById(Integer id);
}

package cn.qdd.tlias.mapper;

import cn.qdd.tlias.pojo.Emp;
import cn.qdd.tlias.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: qdd
 * @Description: EmpMapper.xml
 * @DateTime: 2026/3/28 14:36
 **/
@Mapper
public interface EmpMapper {

    Emp login(Emp emp);

    List<Emp> list(EmpQueryParam empQueryParam);

    void insert(Emp emp);

    void deleteByIds(List<Integer> ids);

    Emp getById(Integer id);

    void updateById(Emp emp);

    /**
     * 统计各个职位的员工人数
     */
    @MapKey("pos")
    List<Map<String,Object>> countEmpJobData();


    /**
     * 统计员工性别信息
     */
    @MapKey("name")
    List<Map> countEmpGenderData();

}

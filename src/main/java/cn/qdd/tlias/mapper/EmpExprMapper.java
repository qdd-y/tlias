package cn.qdd.tlias.mapper;

import cn.qdd.tlias.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: qdd
 * @Description: EmpExprMapper
 * @DateTime: 2026/3/28 15:11
 **/
@Mapper
public interface EmpExprMapper {
    /**
     * 批量插入员工工作经历信息
     */
     void insertBatch(List<EmpExpr> exprList);

    /**
     * 根据员工的ID批量删除工作经历信息
     */
    void deleteByEmpIds(List<Integer> empIds);
}

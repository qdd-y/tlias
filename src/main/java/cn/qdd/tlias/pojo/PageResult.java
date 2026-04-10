package cn.qdd.tlias.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: qdd
 * @Description: PageResult
 * @DateTime: 2026/3/28 14:38
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult {
    private Long total; //总记录数
    private List rows; //当前页数据列表
}

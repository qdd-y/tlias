package cn.qdd.tlias.pojo;

import lombok.Data;

/**
 * 班级分页查询参数
 */
@Data
public class ClazzQueryParam {
    private Integer page = 1;
    private Integer pageSize = 10;
    private String name;
    private String room;
    private Integer masterId;
    private Integer subject;
}

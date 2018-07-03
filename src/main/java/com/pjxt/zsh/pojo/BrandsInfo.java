package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 品牌信息表
 */
@Data
public class BrandsInfo {
    /** 品牌id */
    private String brandsId;
    /** 品牌名称 */
    private String brandsName;
    /** 生产厂家 */
    private String producer;
    /** 更新时间 */
    private Date updateTime;
    /** 经办人ID */
    private String agentId;

}
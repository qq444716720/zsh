package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 备件基本信息表
 */
@Data
public class SpareInfo {
    /** 备件ID */
    private String spareId;
    /** 备件父级ID */
    private String spareParentId;
    /** 备件名称 */
    private String spareName;
    /** 备件型号 */
    private String spareModel;
    /** ERP编号 */
    private String erpNo;
    /** 品牌ID */
    private String brandsId;
    /** 供应商ID */
    private String supplierId;
    /** 单位 */
    private String unit;
    /** 预警数量 */
    private Integer inventoryWarningQuantity;
    /** 描述 */
    private String explain;
    /** 更新时间 */
    private Date updateTime;
    /** 经办人ID */
    private String agentId;

}
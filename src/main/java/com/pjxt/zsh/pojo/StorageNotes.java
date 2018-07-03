package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 入库记录表
 */
@Data
public class StorageNotes {
    /** 入库ID */
    private String storageId;
    /** 备件ID */
    private String spareId;
    /** 工单号 */
    private String workOrderNo;
    /** 入库类型 */
    private String storageType;
    /** 入库数量 */
    private Integer storageQuantity;
    /** 仓库ID */
    private String depotId;
    /** 入库时间 */
    private Date storageTime;
    /** 经办人ID */
    private String agentId;
    /** 描述 */
    private String explain;

}
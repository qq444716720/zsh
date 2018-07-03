package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 出库记录表
 */
@Data
public class OutboundNotes {
    /** 出库ID */
    private String outboundId;
    /** 备件ID */
    private String spareId;
    /** 工单号 */
    private String workOrderNo;
    /** 出库类型 */
    private String outboundType;
    /** 出库数量 */
    private Integer outboundQuantity;
    /** 仓库ID */
    private String depotId;
    /** 出库时间 */
    private Date outboundTime;
    /** 经办人ID */
    private String agentId;
    /** 描述 */
    private String explain;

}
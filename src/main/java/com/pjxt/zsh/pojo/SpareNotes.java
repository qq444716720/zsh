package com.pjxt.zsh.pojo;

import lombok.Data;

/**
 * 备件记录表实体
 */
@Data
public class SpareNotes {
    /** 备件ID */
    private String spareId;
    /** 备件状态 */
    private String spareStatus;
    /** 工单号 */
    private String workOrderNo;
    /** 入库类型 */
    private String storageType;
    /** 出库类型 */
    private String outboundType;
    /** 报废类型 */
    private String scrapType;
    /** 数量 */
    private String quantity;
    /** 仓库ID */
    private String depotId;
    /** 创建时间 */
    private String createTime;
    /** 经办人ID */
    private String agentId;

}
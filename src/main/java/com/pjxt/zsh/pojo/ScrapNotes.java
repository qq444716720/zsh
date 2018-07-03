package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 报废记录表
 */
@Data
public class ScrapNotes {
    /** 报废ID */
    private String scrapId;
    /** 备件ID */
    private String spareId;
    /** 工单号 */
    private String workOrderNo;
    /** 技术鉴定单号 */
    private String technicalAppraisalOrderNo;
    /** 报废类型 */
    private String scrapType;
    /** 报废数量 */
    private Integer scrapQuantity;
    /** 仓库 */
    private String depot;
    /** 报废时间 */
    private Date scrapTime;
    /** 经办人ID */
    private String agentId;
    /** 描述 */
    private String explain;

}
package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 备件库存表
 */
@Data
public class InventoryInfo {
    /** 设备ID */
    private String spareId;
    /** 在库数量 */
    private Integer inventory;
    /** 仓库ID */
    private String depotId;
    /** 更新时间 */
    private Date updateTime;
    /** 经办人ID */
    private String agentId;

}
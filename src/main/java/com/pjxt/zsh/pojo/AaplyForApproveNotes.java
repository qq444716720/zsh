package com.pjxt.zsh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 申请审批表
 */
@Data
public class AaplyForApproveNotes {
    private String id;
    /** 申请人ID */
    private String applyUserId;
    /** 申请备件ID */
    private String spareId;
    /** 申请数量 */
    private Integer quantity;
    /** 申请时间 */
    private Date applyTime;
    /** 审批人ID */
    private String approveId;
    /** 申请备件ID */
    private Date approveTime;
    /** 标识 */
    private String mark;
    /** 申请描述 */
    private String applyExplain;
    /** 审批描述 */
    private String approveExplain;

}
package com.pjxt.zsh.pojo;

import lombok.Data;

/**
 * 供应商信息表
 */
@Data
public class SupplierInfo {
    /** 供应商ID */
    private String supplierId;
    /** 供应商名称 */
    private String supplierName;
    /** 联系人 */
    private String contacts;
    /** 联系人电话 */
    private String phone;
    /** 通讯地址 */
    private String address;
    /** 经办人ID */
    private String agentId;

}
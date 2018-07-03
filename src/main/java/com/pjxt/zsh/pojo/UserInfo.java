package com.pjxt.zsh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 系统用户表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    /** 用户ID */
    private String userId;
    /** 用户名 */
    private String userName;
    /** 用户昵称 */
    private String name;
    /** 密码 */
    @JsonIgnore
    private String password;
    /** 创建时间 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime;
    /** 权限 */
    private String authority;

}
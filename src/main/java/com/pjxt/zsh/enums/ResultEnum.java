package com.pjxt.zsh.enums;


/**
 * 返回 状态码和提示消息 枚举管理
 */
public enum ResultEnum {
    UNKONW_ERROR(-1, "服务器错误"),
    SAVE_ERROR(101, "保存失败"),
    UPDATE_ERROR(102, "修改失败"),
    NOT_LOGIN(201, "未登录"),
    LOGIN_ERROR(202, "账号或密码错误"),
    LONGIN_EXPIRE_TIME(203, "请重新登录"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

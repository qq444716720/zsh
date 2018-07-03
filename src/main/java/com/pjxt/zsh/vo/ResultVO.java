package com.pjxt.zsh.vo;

import lombok.Data;

/**
 * http 返回对象
 */
@Data
public class ResultVO {

    /** 状态码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 返回数据 */
    private Object data;

    public ResultVO() {

    }

    public ResultVO(Integer code, String msg) {
        this(code, msg, null);
    }

    public ResultVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功
     * @param data 数据
     * @return
     */
    public static ResultVO success(Object data) {
        return new ResultVO(200, "成功", data);
    }

    public static ResultVO success() {
        return success(null);
    }

    /**
     * 失败
     * @param code 状态码
     * @param msg 提示信息
     * @return
     */
    public static ResultVO fail(Integer code, String msg) {
        return new ResultVO(code, msg);
    }
}

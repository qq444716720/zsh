package com.pjxt.zsh.exception;

import com.pjxt.zsh.enums.ResultEnum;
import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class SystemException extends RuntimeException {

    private Integer code;

    public SystemException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}

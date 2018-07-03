package com.pjxt.zsh.handle;

import com.pjxt.zsh.enums.ResultEnum;
import com.pjxt.zsh.exception.SystemException;
import com.pjxt.zsh.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理所有异常
 */

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handle(Exception e) {
        e.printStackTrace();
        if (e instanceof SystemException) { // 处理自己的异常
            SystemException systemException = (SystemException) e;
            return ResultVO.fail(systemException.getCode(), systemException.getMessage());
        } else { // 系统异常
            return ResultVO.fail(ResultEnum.UNKONW_ERROR.getCode(), ResultEnum.UNKONW_ERROR.getMsg());
        }
    }
}

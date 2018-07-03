package com.pjxt.zsh.controller;

import com.pjxt.zsh.enums.ResultEnum;
import com.pjxt.zsh.exception.SystemException;
import com.pjxt.zsh.utils.JWTUtil;
import com.pjxt.zsh.vo.ResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping(value = "/login")
    ResultVO login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if("admin".equals(username) && "123456".equals(password)) {
            String token = JWTUtil.createToken(username);
            return ResultVO.success(token);
        }
        throw new SystemException(ResultEnum.LOGIN_ERROR);
    }

}

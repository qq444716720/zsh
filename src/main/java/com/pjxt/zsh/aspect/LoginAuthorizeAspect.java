package com.pjxt.zsh.aspect;

import com.pjxt.zsh.enums.ResultEnum;
import com.pjxt.zsh.exception.SystemException;
import com.pjxt.zsh.utils.JWTUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * AOP 拦截器 登录校验
 */
@Aspect
@Component
@Slf4j
public class LoginAuthorizeAspect {

    // 切入点
    @Pointcut("execution(public * com.pjxt.zsh.controller.*.*(..))")
    public void verify() {}

    @Before("verify()")
    public void doVerify() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        // 从request 中获取cookie 校验
        HttpServletRequest request = attributes.getRequest();
        String token = request.getHeader("Authorization");
        String username = JWTUtil.getUsername(token);

        if(username == null) {
            throw new SystemException(ResultEnum.LONGIN_EXPIRE_TIME);
        }
    }

}

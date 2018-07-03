package com.pjxt.zsh.controller;

import com.pjxt.zsh.pojo.UserInfo;
import com.pjxt.zsh.service.UserInfoService;
import com.pjxt.zsh.vo.ResultVO;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserInfoController {

    private final UserInfoService userInfoService;

    public  UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping(value = "/userinfo/{id}")
    public ResultVO getUserInfo(@PathVariable("id") String id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("111");
        return ResultVO.success(userInfoService.selectPage(userInfo, 1, 1));
    }

}

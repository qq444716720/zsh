package com.pjxt.zsh.service.impl;

import com.pjxt.zsh.base.BaseServiceImpl;
import com.pjxt.zsh.dao.UserInfoMapper;
import com.pjxt.zsh.pojo.UserInfo;
import com.pjxt.zsh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoServiceImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

}

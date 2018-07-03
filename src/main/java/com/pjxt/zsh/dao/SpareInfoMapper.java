package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.SpareInfo;

public interface SpareInfoMapper {
    int deleteByPrimaryKey(String spareId);

    int insert(SpareInfo record);

    int insertSelective(SpareInfo record);

    SpareInfo selectByPrimaryKey(String spareId);

    int updateByPrimaryKeySelective(SpareInfo record);

    int updateByPrimaryKey(SpareInfo record);
}
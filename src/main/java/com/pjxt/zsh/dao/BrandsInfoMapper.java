package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.BrandsInfo;

public interface BrandsInfoMapper {
    int deleteByPrimaryKey(String brandsId);

    int insert(BrandsInfo record);

    int insertSelective(BrandsInfo record);

    BrandsInfo selectByPrimaryKey(String brandsId);

    int updateByPrimaryKeySelective(BrandsInfo record);

    int updateByPrimaryKey(BrandsInfo record);
}
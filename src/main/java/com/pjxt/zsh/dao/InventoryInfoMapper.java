package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.InventoryInfo;

public interface InventoryInfoMapper {
    int deleteByPrimaryKey(String spareId);

    int insert(InventoryInfo record);

    int insertSelective(InventoryInfo record);

    InventoryInfo selectByPrimaryKey(String spareId);

    int updateByPrimaryKeySelective(InventoryInfo record);

    int updateByPrimaryKey(InventoryInfo record);
}
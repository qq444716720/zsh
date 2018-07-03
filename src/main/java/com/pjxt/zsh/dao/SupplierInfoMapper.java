package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.SupplierInfo;

public interface SupplierInfoMapper {
    int deleteByPrimaryKey(String supplierId);

    int insert(SupplierInfo record);

    int insertSelective(SupplierInfo record);

    SupplierInfo selectByPrimaryKey(String supplierId);

    int updateByPrimaryKeySelective(SupplierInfo record);

    int updateByPrimaryKey(SupplierInfo record);
}
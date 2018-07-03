package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.StorageNotes;

public interface StorageNotesMapper {
    int deleteByPrimaryKey(String storageId);

    int insert(StorageNotes record);

    int insertSelective(StorageNotes record);

    StorageNotes selectByPrimaryKey(String storageId);

    int updateByPrimaryKeySelective(StorageNotes record);

    int updateByPrimaryKey(StorageNotes record);
}
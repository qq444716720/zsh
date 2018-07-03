package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.AaplyForApproveNotes;

public interface AaplyForApproveNotesMapper {
    int deleteByPrimaryKey(String id);

    int insert(AaplyForApproveNotes record);

    int insertSelective(AaplyForApproveNotes record);

    AaplyForApproveNotes selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AaplyForApproveNotes record);

    int updateByPrimaryKey(AaplyForApproveNotes record);
}
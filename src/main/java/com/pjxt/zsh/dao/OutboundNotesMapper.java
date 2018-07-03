package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.OutboundNotes;

public interface OutboundNotesMapper {
    int deleteByPrimaryKey(String outboundId);

    int insert(OutboundNotes record);

    int insertSelective(OutboundNotes record);

    OutboundNotes selectByPrimaryKey(String outboundId);

    int updateByPrimaryKeySelective(OutboundNotes record);

    int updateByPrimaryKey(OutboundNotes record);
}
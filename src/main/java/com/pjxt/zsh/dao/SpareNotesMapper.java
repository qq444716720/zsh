package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.SpareNotes;

public interface SpareNotesMapper {
    int deleteByPrimaryKey(String spareId);

    int insert(SpareNotes record);

    int insertSelective(SpareNotes record);

    SpareNotes selectByPrimaryKey(String spareId);

    int updateByPrimaryKeySelective(SpareNotes record);

    int updateByPrimaryKey(SpareNotes record);
}
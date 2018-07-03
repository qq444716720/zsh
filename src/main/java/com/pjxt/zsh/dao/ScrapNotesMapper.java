package com.pjxt.zsh.dao;

import com.pjxt.zsh.pojo.ScrapNotes;

public interface ScrapNotesMapper {
    int deleteByPrimaryKey(String scrapId);

    int insert(ScrapNotes record);

    int insertSelective(ScrapNotes record);

    ScrapNotes selectByPrimaryKey(String scrapId);

    int updateByPrimaryKeySelective(ScrapNotes record);

    int updateByPrimaryKey(ScrapNotes record);
}
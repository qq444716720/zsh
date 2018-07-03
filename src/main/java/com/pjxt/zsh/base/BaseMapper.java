package com.pjxt.zsh.base;

import java.util.List;

public interface BaseMapper<T> {

    int insert(T pojo);

    int delete(String id);

    int update(T pojo);

    T selectOne(String is);

    List<T> selectList(T pojo);

}

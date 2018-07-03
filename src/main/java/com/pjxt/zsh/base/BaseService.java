package com.pjxt.zsh.base;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {

    int insert(T pojo);

    int delete(String id);

    int update(T pojo);

    T selectOne(String id);

    List<T> selectList(T pojo);

    Map<String, Object> selectPage(T pojo, Integer pageNum, Integer pageSize);

}

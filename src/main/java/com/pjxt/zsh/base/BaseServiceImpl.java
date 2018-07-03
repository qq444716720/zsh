package com.pjxt.zsh.base;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pjxt.zsh.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> implements BaseService<T> {

    @Autowired
    private M baseMapper;

    public int insert (T pojo) {

        return this.baseMapper.insert(pojo);
    }

    public int delete(String id) {

        return this.baseMapper.delete(id);
    }

    public int update(T pojo) {

        return this.baseMapper.update(pojo);
    }

    public T selectOne(String id) {

        return this.baseMapper.selectOne(id);
    }


    public List<T> selectList(T pojo) {

        return this.baseMapper.selectList(pojo);
    }

    @Override
    public Map<String, Object> selectPage(T pojo, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<T> list = this.baseMapper.selectList(pojo);
        PageInfo pageInfo = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>();
        map.put("total", pageInfo.getTotal());
        map.put("list", pageInfo.getList());
        return map;
    }
}

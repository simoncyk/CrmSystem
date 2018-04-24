package com.CrmSystem.dao;

import com.CrmSystem.pojo.basedict;

public interface basedictMapper {
    int deleteByPrimaryKey(String dictId);

    int insert(basedict record);

    int insertSelective(basedict record);

    basedict selectByPrimaryKey(String dictId);

    int updateByPrimaryKeySelective(basedict record);

    int updateByPrimaryKey(basedict record);
}
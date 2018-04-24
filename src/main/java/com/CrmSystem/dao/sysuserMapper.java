package com.CrmSystem.dao;

import com.CrmSystem.pojo.sysuser;

public interface sysuserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(sysuser record);

    int insertSelective(sysuser record);

    sysuser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(sysuser record);

    int updateByPrimaryKey(sysuser record);
}
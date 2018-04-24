package com.CrmSystem.dao;

import com.CrmSystem.pojo.customer;

public interface customerMapper {
    int deleteByPrimaryKey(Long custId);

    int insert(customer record);

    int insertSelective(customer record);

    customer selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(customer record);

    int updateByPrimaryKey(customer record);
}
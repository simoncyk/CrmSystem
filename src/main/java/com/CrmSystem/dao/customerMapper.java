package com.CrmSystem.dao;

import com.CrmSystem.pojo.customer;
import com.CrmSystem.pojo.customerVo;

import java.util.List;

public interface customerMapper {
    int deleteByPrimaryKey(Long custId);

    int insert(customer record);

    int insertSelective(customer record);

    customer selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(customer record);

    int updateByPrimaryKey(customer record);


    /**
     * 根据queryVo分页查询数据
     *
     * @param queryVo
     * @return
     */
    List<customer> queryCustomerByQueryVo(customerVo customerVo );
    customer queryCustomerById(Long id);
    /**
     * 根据id编辑客户
     *
     * @param customer
     */
    int updateCustomerById(customer customer);
    /**
     * 根据id删除用户
     *
     * @param id
     */
    void deleteCustomerById(Long id);







}
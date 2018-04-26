package com.CrmSystem.service;

import com.CrmSystem.pojo.basedict;
import com.CrmSystem.pojo.customer;

import java.util.List;

public interface BaseDictService {


    /**
     * 根据类别代码查询
     *
     * @param dictTypeCode
     * @return
     */
    List<basedict> queryBaseDictByDictTypeCode(String dictTypeCode);
    List<customer> queryCustomerByQueryVo();
    customer queryCustomerById(Long id);
    int updateCustomerById(customer customer);
    /**
     * 根据id删除客户
     *
     * @param id
     */
    void deleteCustomerById(Long id);



}

package com.CrmSystem.service;

import com.CrmSystem.dao.basedictMapper;
import com.CrmSystem.dao.customerMapper;
import com.CrmSystem.pojo.basedict;
import com.CrmSystem.pojo.customer;
import com.CrmSystem.pojo.customerVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BaseDictServiceImpl implements  BaseDictService {

    @Autowired
    private basedictMapper baseDictMapper;
    @Autowired
    private customerMapper customerMapper;

    @Override
    public List<basedict> queryBaseDictByDictTypeCode(String dictTypeCode)  {

            List<basedict> list = baseDictMapper.queryBaseDictByDictTypeCode(dictTypeCode);
            return list;


    }
    @Override
    public List<customer> queryCustomerByQueryVo(customerVo customerVo ){

        List<customer> list = customerMapper.queryCustomerByQueryVo(customerVo);


        return list;

    }

    @Override
    public customer queryCustomerById(Long id) {
        customer customer = this.customerMapper.queryCustomerById(id);
        return customer;
    }

    @Override
    public int updateCustomerById(customer customer) {
       return  this.customerMapper.updateCustomerById(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        this.customerMapper.deleteCustomerById(id);
    }

}

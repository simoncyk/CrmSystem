package com.CrmSystem.service;

import com.CrmSystem.dao.basedictMapper;
import com.CrmSystem.pojo.basedict;
import org.springframework.beans.factory.annotation.Autowired;
import  com.CrmSystem.pojo.basedict;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class BaseDictServiceImpl implements  BaseDictService {

    @Autowired
    private basedictMapper baseDictMapper;

    @Override
    public List<basedict> queryBaseDictByDictTypeCode(String dictTypeCode)  {

            List<basedict> list = baseDictMapper.queryBaseDictByDictTypeCode(dictTypeCode);
            return list;


    }

}

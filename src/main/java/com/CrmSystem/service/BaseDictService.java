package com.CrmSystem.service;

import com.CrmSystem.pojo.basedict;

import java.util.List;

public interface BaseDictService {


    /**
     * 根据类别代码查询
     *
     * @param dictTypeCode
     * @return
     */
    List<basedict> queryBaseDictByDictTypeCode(String dictTypeCode);



}

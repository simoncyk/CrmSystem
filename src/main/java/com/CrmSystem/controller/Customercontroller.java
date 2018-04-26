package com.CrmSystem.controller;

import java.util.List;
import com.CrmSystem.pojo.basedict;
import com.CrmSystem.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2018/04/24
 * \* Time: 16:36
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Controller
@RequestMapping("customer")
public class Customercontroller {

    @Autowired
    private BaseDictService baseDictService ;
    @RequestMapping("list")
    public String queryCustomerList(Model model) {
        // 客户来源
        List<basedict> fromType = this.baseDictService.queryBaseDictByDictTypeCode("002");

        // 所属行业
        List<basedict> industryType = this.baseDictService.queryBaseDictByDictTypeCode("001");
        // 客户级别
        List<basedict> levelType = this.baseDictService.queryBaseDictByDictTypeCode("006");

        // 把前端页面需要显示的数据放到模型中

        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

        return "customer";
    }


}
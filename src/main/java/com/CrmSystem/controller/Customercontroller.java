package com.CrmSystem.controller;

import java.util.List;
import com.CrmSystem.pojo.basedict;
import com.CrmSystem.pojo.customer;
import com.CrmSystem.pojo.customerVo;
import com.CrmSystem.service.BaseDictService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("index")
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
    @RequestMapping("list.action")
    public String selectCustomerList( Model model, customerVo customerVo) {
        // 客户来源
        List<basedict> fromType = this.baseDictService.queryBaseDictByDictTypeCode("002");

        // 所属行业
        List<basedict> industryType = this.baseDictService.queryBaseDictByDictTypeCode("001");
        // 客户级别
        List<basedict> levelType = this.baseDictService.queryBaseDictByDictTypeCode("006");
        PageHelper.startPage(Integer.parseInt(customerVo.getPagenum()) , 10);

        try {
            // 解决get请求乱码问题
            if (StringUtils.isNotBlank(customerVo.getCust_name())) {
                customerVo.setCust_name(new String(customerVo.getCust_name().getBytes("ISO-8859-1"), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<customer> QLLlist = this.baseDictService.queryCustomerByQueryVo(customerVo);
        PageInfo<customer> pageInfo = new PageInfo<>(QLLlist);
        // 把前端页面需要显示的数据放到模型中
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);
        model.addAttribute("page", QLLlist);
        model.addAttribute("pageInfo", pageInfo);
        // 把前端页面查询条件数据返回
        model.addAttribute("custName",customerVo.getCust_name());
        model.addAttribute("custSource", customerVo.getCust_source());
        model.addAttribute("custIndustry", customerVo.getCust_industry());
        model.addAttribute("custLevel", customerVo.getCust_level());



        return "customer";
    }
    @RequestMapping("edit.action")
    @ResponseBody
    public customer queryCustomerById(Long id) {
        customer customer = this.baseDictService.queryCustomerById(id);
        return customer;
    }
    @RequestMapping("update.action")
    @ResponseBody
    public String updateCustomerById(customer customer) {
        int result = this.baseDictService.updateCustomerById(customer);

        return"OK";
    }
    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @RequestMapping("delete.action")
    @ResponseBody
    public String deleteCustomerById(Long id) {
        this.baseDictService.deleteCustomerById(id);
        return"ok";
    }




}
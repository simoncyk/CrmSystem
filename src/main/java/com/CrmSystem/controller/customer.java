package com.CrmSystem.controller;

import org.springframework.stereotype.Controller;
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
public class customer {

    @RequestMapping("list")
    public String queryCustomerList() {
        System.out.print("---->in!!宁海福建省的讲法考虑的实际付款带上飞机代课老师");
        return "customer";
    }


}
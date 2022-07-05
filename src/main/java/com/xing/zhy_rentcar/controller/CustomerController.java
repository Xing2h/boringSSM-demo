package com.xing.zhy_rentcar.controller;

import com.xing.zhy_rentcar.pojo.Customer;
import com.xing.zhy_rentcar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author Xing
 * @Date 2022/7/5 16:09
 * @Package com.xing.zhy_rentcar.controller
 * @Description
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/selectCustomer")
    public String selectCustomer(Model model) {
        List<Customer> customers = customerService.queryAllCustomer();
        model.addAttribute("customers", customers);
        return "find_customer";
    }
}

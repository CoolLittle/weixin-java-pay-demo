package com.jgkj.payment.controller;

import com.jgkj.payment.bean.PaymentProduct;
import com.jgkj.payment.mapper.PaymentProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chen on 2017/6/23.
 */
@Controller
@ResponseBody
public class ProductController {
    @Autowired
    PaymentProductMapper paymentProductMapper;

    @RequestMapping("/getAllProducts")
    public Object getALlProduct() {
        return paymentProductMapper.selectAllProduct();
    }

    public PaymentProduct addProduct() {
        return null;
    }
}

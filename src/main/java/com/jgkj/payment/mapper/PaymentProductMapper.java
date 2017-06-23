package com.jgkj.payment.mapper;

import com.jgkj.payment.bean.PaymentProduct;

import java.util.List;

public interface PaymentProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentProduct record);

    int insertSelective(PaymentProduct record);

    PaymentProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentProduct record);

    int updateByPrimaryKey(PaymentProduct record);

    List<PaymentProduct> selectAllProduct();
}
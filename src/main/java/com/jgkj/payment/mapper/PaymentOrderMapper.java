package com.jgkj.payment.mapper;

import com.jgkj.payment.bean.PaymentOrder;

public interface PaymentOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentOrder record);

    int insertSelective(PaymentOrder record);

    PaymentOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentOrder record);

    int updateByPrimaryKey(PaymentOrder record);
}
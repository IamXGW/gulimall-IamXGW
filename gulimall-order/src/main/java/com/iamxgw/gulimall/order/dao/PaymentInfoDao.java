package com.iamxgw.gulimall.order.dao;

import com.iamxgw.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:34:27
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

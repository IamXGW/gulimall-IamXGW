package com.iamxgw.gulimall.coupon.dao;

import com.iamxgw.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:07:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

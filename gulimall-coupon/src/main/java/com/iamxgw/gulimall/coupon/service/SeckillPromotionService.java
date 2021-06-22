package com.iamxgw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iamxgw.common.utils.PageUtils;
import com.iamxgw.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:07:23
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.iamxgw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iamxgw.common.utils.PageUtils;
import com.iamxgw.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:07:22
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


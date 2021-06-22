package com.iamxgw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iamxgw.common.utils.PageUtils;
import com.iamxgw.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:34:27
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


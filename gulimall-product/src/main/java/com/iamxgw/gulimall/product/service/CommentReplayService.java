package com.iamxgw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iamxgw.common.utils.PageUtils;
import com.iamxgw.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-21 16:35:29
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.iamxgw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iamxgw.common.utils.PageUtils;
import com.iamxgw.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-21 16:35:29
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


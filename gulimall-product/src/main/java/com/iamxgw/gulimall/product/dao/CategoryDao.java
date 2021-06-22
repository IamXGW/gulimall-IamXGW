package com.iamxgw.gulimall.product.dao;

import com.iamxgw.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-21 16:35:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

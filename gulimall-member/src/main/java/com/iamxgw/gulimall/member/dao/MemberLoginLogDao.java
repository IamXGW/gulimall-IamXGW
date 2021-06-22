package com.iamxgw.gulimall.member.dao;

import com.iamxgw.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:21:16
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}

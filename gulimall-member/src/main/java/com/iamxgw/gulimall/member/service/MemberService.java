package com.iamxgw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iamxgw.common.utils.PageUtils;
import com.iamxgw.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author IamXGW
 * @email iamxgw@gmail.com
 * @date 2021-06-22 13:21:16
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


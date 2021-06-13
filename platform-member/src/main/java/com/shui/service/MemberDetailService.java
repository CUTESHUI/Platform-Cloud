package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.MemberDetailEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:16
 */
public interface MemberDetailService extends IService<MemberDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


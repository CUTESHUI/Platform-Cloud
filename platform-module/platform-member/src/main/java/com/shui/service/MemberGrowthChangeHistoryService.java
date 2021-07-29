package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.MemberGrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:15
 */
public interface MemberGrowthChangeHistoryService extends IService<MemberGrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.ChannelDetailEntity;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:22:36
 */
public interface ChannelDetailService extends IService<ChannelDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


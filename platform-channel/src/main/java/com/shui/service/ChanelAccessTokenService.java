package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.ChanelAccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:22:36
 */
public interface ChanelAccessTokenService extends IService<ChanelAccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


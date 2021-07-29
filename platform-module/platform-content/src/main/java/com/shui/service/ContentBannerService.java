package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.ContentBannerEntity;

import java.util.Map;

/**
 * 内容-banner
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
public interface ContentBannerService extends IService<ContentBannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


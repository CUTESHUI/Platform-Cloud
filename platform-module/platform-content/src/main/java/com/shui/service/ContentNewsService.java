package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.ContentNewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
public interface ContentNewsService extends IService<ContentNewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


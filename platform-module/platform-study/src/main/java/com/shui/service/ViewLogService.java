package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.ViewLogEntity;

import java.util.Map;

/**
 * 学习-用户学习浏览记录表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-13 23:42:33
 */
public interface ViewLogService extends IService<ViewLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


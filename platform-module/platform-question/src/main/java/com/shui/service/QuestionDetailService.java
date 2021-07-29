package com.shui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shui.common.utils.PageUtils;
import com.shui.entity.QuestionDetailEntity;

import java.util.Map;

/**
 * 题目-题目表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:06:17
 */
public interface QuestionDetailService extends IService<QuestionDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


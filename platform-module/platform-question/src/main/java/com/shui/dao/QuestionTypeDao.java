package com.shui.dao;

import com.shui.entity.QuestionTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:06:17
 */
@Mapper
public interface QuestionTypeDao extends BaseMapper<QuestionTypeEntity> {
	
}

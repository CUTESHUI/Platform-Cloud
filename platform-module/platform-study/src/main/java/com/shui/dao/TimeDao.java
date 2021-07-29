package com.shui.dao;

import com.shui.entity.TimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-13 23:42:33
 */
@Mapper
public interface TimeDao extends BaseMapper<TimeEntity> {
	
}

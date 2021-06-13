package com.shui.dao;

import com.shui.entity.ContentNewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
@Mapper
public interface ContentNewsDao extends BaseMapper<ContentNewsEntity> {
	
}

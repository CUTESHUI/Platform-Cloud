package com.shui.dao;

import com.shui.entity.MemberDetailEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:16
 */
@Mapper
public interface MemberDetailDao extends BaseMapper<MemberDetailEntity> {
	
}

package com.shui.dao;

import com.shui.entity.MemberGrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-积分值变化历史记录表
 * 
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:15
 */
@Mapper
public interface MemberGrowthChangeHistoryDao extends BaseMapper<MemberGrowthChangeHistoryEntity> {
	
}

package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.MemberGrowthChangeHistoryDao;
import com.shui.entity.MemberGrowthChangeHistoryEntity;
import com.shui.service.MemberGrowthChangeHistoryService;


@Service
public class MemberGrowthChangeHistoryServiceImpl extends ServiceImpl<MemberGrowthChangeHistoryDao, MemberGrowthChangeHistoryEntity> implements MemberGrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberGrowthChangeHistoryEntity> page = this.page(
                new Query<MemberGrowthChangeHistoryEntity>().getPage(params),
                new QueryWrapper<MemberGrowthChangeHistoryEntity>()
        );

        return new PageUtils(page);
    }

}
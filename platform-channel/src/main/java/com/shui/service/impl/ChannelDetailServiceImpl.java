package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.ChannelDetailDao;
import com.shui.entity.ChannelDetailEntity;
import com.shui.service.ChannelDetailService;


@Service
public class ChannelDetailServiceImpl extends ServiceImpl<ChannelDetailDao, ChannelDetailEntity> implements ChannelDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ChannelDetailEntity> page = this.page(
                new Query<ChannelDetailEntity>().getPage(params),
                new QueryWrapper<ChannelDetailEntity>()
        );

        return new PageUtils(page);
    }

}
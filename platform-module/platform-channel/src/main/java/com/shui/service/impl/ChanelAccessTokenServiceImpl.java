package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.ChanelAccessTokenDao;
import com.shui.entity.ChanelAccessTokenEntity;
import com.shui.service.ChanelAccessTokenService;


@Service
public class ChanelAccessTokenServiceImpl extends ServiceImpl<ChanelAccessTokenDao, ChanelAccessTokenEntity> implements ChanelAccessTokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ChanelAccessTokenEntity> page = this.page(
                new Query<ChanelAccessTokenEntity>().getPage(params),
                new QueryWrapper<ChanelAccessTokenEntity>()
        );

        return new PageUtils(page);
    }

}
package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.ContentBannerDao;
import com.shui.entity.ContentBannerEntity;
import com.shui.service.ContentBannerService;


@Service
public class ContentBannerServiceImpl extends ServiceImpl<ContentBannerDao, ContentBannerEntity> implements ContentBannerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ContentBannerEntity> page = this.page(
                new Query<ContentBannerEntity>().getPage(params),
                new QueryWrapper<ContentBannerEntity>()
        );

        return new PageUtils(page);
    }

}
package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.ContentNewsDao;
import com.shui.entity.ContentNewsEntity;
import com.shui.service.ContentNewsService;


@Service
public class ContentNewsServiceImpl extends ServiceImpl<ContentNewsDao, ContentNewsEntity> implements ContentNewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ContentNewsEntity> page = this.page(
                new Query<ContentNewsEntity>().getPage(params),
                new QueryWrapper<ContentNewsEntity>()
        );

        return new PageUtils(page);
    }

}
package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.ViewLogDao;
import com.shui.entity.ViewLogEntity;
import com.shui.service.ViewLogService;


@Service
public class ViewLogServiceImpl extends ServiceImpl<ViewLogDao, ViewLogEntity> implements ViewLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ViewLogEntity> page = this.page(
                new Query<ViewLogEntity>().getPage(params),
                new QueryWrapper<ViewLogEntity>()
        );

        return new PageUtils(page);
    }

}
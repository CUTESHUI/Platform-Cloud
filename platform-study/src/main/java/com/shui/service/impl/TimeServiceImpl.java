package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.TimeDao;
import com.shui.entity.TimeEntity;
import com.shui.service.TimeService;


@Service
public class TimeServiceImpl extends ServiceImpl<TimeDao, TimeEntity> implements TimeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TimeEntity> page = this.page(
                new Query<TimeEntity>().getPage(params),
                new QueryWrapper<TimeEntity>()
        );

        return new PageUtils(page);
    }

}
package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.QuestionDetailDao;
import com.shui.entity.QuestionDetailEntity;
import com.shui.service.QuestionDetailService;


@Service
public class QuestionDetailServiceImpl extends ServiceImpl<QuestionDetailDao, QuestionDetailEntity> implements QuestionDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionDetailEntity> page = this.page(
                new Query<QuestionDetailEntity>().getPage(params),
                new QueryWrapper<QuestionDetailEntity>()
        );

        return new PageUtils(page);
    }

}
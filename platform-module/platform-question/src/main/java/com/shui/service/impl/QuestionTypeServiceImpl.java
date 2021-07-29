package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.QuestionTypeDao;
import com.shui.entity.QuestionTypeEntity;
import com.shui.service.QuestionTypeService;


@Service
public class QuestionTypeServiceImpl extends ServiceImpl<QuestionTypeDao, QuestionTypeEntity> implements QuestionTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionTypeEntity> page = this.page(
                new Query<QuestionTypeEntity>().getPage(params),
                new QueryWrapper<QuestionTypeEntity>()
        );

        return new PageUtils(page);
    }

}
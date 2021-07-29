package com.shui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.Query;

import com.shui.dao.MemberDetailDao;
import com.shui.entity.MemberDetailEntity;
import com.shui.service.MemberDetailService;


@Service
public class MemberDetailServiceImpl extends ServiceImpl<MemberDetailDao, MemberDetailEntity> implements MemberDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberDetailEntity> page = this.page(
                new Query<MemberDetailEntity>().getPage(params),
                new QueryWrapper<MemberDetailEntity>()
        );

        return new PageUtils(page);
    }

}
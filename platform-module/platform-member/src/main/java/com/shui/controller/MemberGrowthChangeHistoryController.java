package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.MemberGrowthChangeHistoryEntity;
import com.shui.service.MemberGrowthChangeHistoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员-积分值变化历史记录表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:15
 */
@RestController
@RequestMapping("MemberGrowthChangeHistory")
@Api(tags = "会员-积分值变化历史记录表")
public class MemberGrowthChangeHistoryController {
    @Autowired
    private MemberGrowthChangeHistoryService memberGrowthChangeHistoryService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return memberGrowthChangeHistoryService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public MemberGrowthChangeHistoryEntity info(@PathVariable("id") Long id) {
        return memberGrowthChangeHistoryService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody MemberGrowthChangeHistoryEntity memberGrowthChangeHistory) {
        memberGrowthChangeHistoryService.save(memberGrowthChangeHistory);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody MemberGrowthChangeHistoryEntity memberGrowthChangeHistory) {
        memberGrowthChangeHistoryService.updateById(memberGrowthChangeHistory);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        memberGrowthChangeHistoryService.removeByIds(Arrays.asList(ids));
    }

}

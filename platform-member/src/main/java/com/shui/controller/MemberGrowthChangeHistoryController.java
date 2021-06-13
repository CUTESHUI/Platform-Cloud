package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.MemberGrowthChangeHistoryEntity;
import com.shui.service.MemberGrowthChangeHistoryService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 会员-积分值变化历史记录表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:15
 */
@RestController
@RequestMapping("MemberGrowthChangeHistory")
public class MemberGrowthChangeHistoryController {
    @Autowired
    private MemberGrowthChangeHistoryService memberGrowthChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberGrowthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberGrowthChangeHistoryEntity memberGrowthChangeHistory = memberGrowthChangeHistoryService.getById(id);

        return R.ok().put("memberGrowthChangeHistory", memberGrowthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberGrowthChangeHistoryEntity memberGrowthChangeHistory){
		memberGrowthChangeHistoryService.save(memberGrowthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberGrowthChangeHistoryEntity memberGrowthChangeHistory){
		memberGrowthChangeHistoryService.updateById(memberGrowthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberGrowthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

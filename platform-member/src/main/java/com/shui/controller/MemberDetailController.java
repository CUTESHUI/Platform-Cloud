package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.MemberDetailEntity;
import com.shui.service.MemberDetailService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 会员-会员表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:16
 */
@RestController
@RequestMapping("MemberDetail")
public class MemberDetailController {
    @Autowired
    private MemberDetailService memberDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberDetailEntity memberDetail = memberDetailService.getById(id);

        return R.ok().put("memberDetail", memberDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberDetailEntity memberDetail){
		memberDetailService.save(memberDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberDetailEntity memberDetail){
		memberDetailService.updateById(memberDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

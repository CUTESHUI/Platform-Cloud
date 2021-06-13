package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import com.shui.entity.QuestionDetailEntity;
import com.shui.service.QuestionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 题目-题目表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:06:17
 */
@RestController
@RequestMapping("QuestionDetail")
public class QuestionDetailController {
    @Autowired
    private QuestionDetailService questionDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = questionDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        QuestionDetailEntity questionDetail = questionDetailService.getById(id);

        return R.ok().put("questionDetail", questionDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuestionDetailEntity questionDetail) {
        questionDetailService.save(questionDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QuestionDetailEntity questionDetail) {
        questionDetailService.updateById(questionDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        questionDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

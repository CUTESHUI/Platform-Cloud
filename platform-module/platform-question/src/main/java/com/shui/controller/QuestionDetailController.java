package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.QuestionDetailEntity;
import com.shui.service.QuestionDetailService;
import io.swagger.annotations.Api;
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
@Api(tags = "题目-题目表")
public class QuestionDetailController {
    @Autowired
    private QuestionDetailService questionDetailService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return questionDetailService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public QuestionDetailEntity info(@PathVariable("id") Long id) {
        return questionDetailService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody QuestionDetailEntity questionDetail) {
        questionDetailService.save(questionDetail);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody QuestionDetailEntity questionDetail) {
        questionDetailService.updateById(questionDetail);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        questionDetailService.removeByIds(Arrays.asList(ids));
    }

}

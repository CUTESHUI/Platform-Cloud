package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.QuestionTypeEntity;
import com.shui.service.QuestionTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 题目-题目类型表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:06:17
 */
@RestController
@RequestMapping("QuestionType")
@Api(tags = "题目-题目类型表")
public class QuestionTypeController {
    @Autowired
    private QuestionTypeService questionTypeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return questionTypeService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public QuestionTypeEntity info(@PathVariable("id") Long id) {
        return questionTypeService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody QuestionTypeEntity questionType) {
        questionTypeService.save(questionType);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody QuestionTypeEntity questionType) {
        questionTypeService.updateById(questionType);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        questionTypeService.removeByIds(Arrays.asList(ids));
    }

}

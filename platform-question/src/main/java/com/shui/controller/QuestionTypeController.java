package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.QuestionTypeEntity;
import com.shui.service.QuestionTypeService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 题目-题目类型表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:06:17
 */
@RestController
@RequestMapping("QuestionType")
public class QuestionTypeController {
    @Autowired
    private QuestionTypeService questionTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = questionTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		QuestionTypeEntity questionType = questionTypeService.getById(id);

        return R.ok().put("questionType", questionType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuestionTypeEntity questionType){
		questionTypeService.save(questionType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QuestionTypeEntity questionType){
		questionTypeService.updateById(questionType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		questionTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

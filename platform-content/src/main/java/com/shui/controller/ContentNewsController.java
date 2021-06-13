package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.ContentNewsEntity;
import com.shui.service.ContentNewsService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 内容-资讯表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
@RestController
@RequestMapping("ContentNews")
public class ContentNewsController {
    @Autowired
    private ContentNewsService contentNewsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = contentNewsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ContentNewsEntity contentNews = contentNewsService.getById(id);

        return R.ok().put("contentNews", contentNews);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ContentNewsEntity contentNews){
		contentNewsService.save(contentNews);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ContentNewsEntity contentNews){
		contentNewsService.updateById(contentNews);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		contentNewsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

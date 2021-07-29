package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.ContentNewsEntity;
import com.shui.service.ContentNewsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 内容-资讯表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
@RestController
@RequestMapping("ContentNews")
@Api(tags = "内容-资讯表")
public class ContentNewsController {
    @Autowired
    private ContentNewsService contentNewsService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return contentNewsService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public ContentNewsEntity info(@PathVariable("id") Long id) {
        return contentNewsService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody ContentNewsEntity contentNews) {
        contentNewsService.save(contentNews);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody ContentNewsEntity contentNews) {
        contentNewsService.updateById(contentNews);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        contentNewsService.removeByIds(Arrays.asList(ids));
    }

}

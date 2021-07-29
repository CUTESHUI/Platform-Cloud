package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.ContentBannerEntity;
import com.shui.service.ContentBannerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 内容-banner
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
@RestController
@RequestMapping("ContentBanner")
@Api(tags = "内容-banner")
public class ContentBannerController {
    @Autowired
    private ContentBannerService contentBannerService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return contentBannerService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public ContentBannerEntity info(@PathVariable("id") Long id) {
        return contentBannerService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody ContentBannerEntity contentBanner) {
        contentBannerService.save(contentBanner);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody ContentBannerEntity contentBanner) {
        contentBannerService.updateById(contentBanner);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        contentBannerService.removeByIds(Arrays.asList(ids));
    }

}

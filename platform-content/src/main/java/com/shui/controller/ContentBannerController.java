package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.ContentBannerEntity;
import com.shui.service.ContentBannerService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 内容-banner
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:20:12
 */
@RestController
@RequestMapping("ContentBanner")
public class ContentBannerController {
    @Autowired
    private ContentBannerService contentBannerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = contentBannerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ContentBannerEntity contentBanner = contentBannerService.getById(id);

        return R.ok().put("contentBanner", contentBanner);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ContentBannerEntity contentBanner){
		contentBannerService.save(contentBanner);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ContentBannerEntity contentBanner){
		contentBannerService.updateById(contentBanner);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		contentBannerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

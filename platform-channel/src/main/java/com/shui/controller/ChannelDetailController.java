package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.ChannelDetailEntity;
import com.shui.service.ChannelDetailService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 渠道-渠道表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:22:36
 */
@RestController
@RequestMapping("ChannelDetail")
public class ChannelDetailController {
    @Autowired
    private ChannelDetailService channelDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = channelDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ChannelDetailEntity channelDetail = channelDetailService.getById(id);

        return R.ok().put("channelDetail", channelDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChannelDetailEntity channelDetail){
		channelDetailService.save(channelDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChannelDetailEntity channelDetail){
		channelDetailService.updateById(channelDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		channelDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

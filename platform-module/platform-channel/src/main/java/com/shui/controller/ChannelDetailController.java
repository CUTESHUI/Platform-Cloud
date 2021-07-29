package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.ChannelDetailEntity;
import com.shui.service.ChannelDetailService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 渠道-渠道表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:22:36
 */
@RestController
@RequestMapping("ChannelDetail")
@Api(tags = "渠道-渠道表")
public class ChannelDetailController {
    @Autowired
    private ChannelDetailService channelDetailService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return channelDetailService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public ChannelDetailEntity info(@PathVariable("id") Long id) {
        return channelDetailService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody ChannelDetailEntity channelDetail) {
        channelDetailService.save(channelDetail);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody ChannelDetailEntity channelDetail) {
        channelDetailService.updateById(channelDetail);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        channelDetailService.removeByIds(Arrays.asList(ids));
    }

}

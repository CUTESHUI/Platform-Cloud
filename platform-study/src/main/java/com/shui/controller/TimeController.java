package com.shui.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import com.shui.entity.TimeEntity;
import com.shui.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 学习-用户学习时常表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-13 23:42:33
 */
@RestController
@RequestMapping("Time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @SentinelResource(value = "getByCode", blockHandler = "handleException")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = timeService.queryPage(params);

        return R.ok().put("page", page);
    }

    public R handleException(Map<String, Object> params, BlockException ex){
        return R.error("达到阈值了,不要再访问了!");
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        TimeEntity time = timeService.getById(id);

        return R.ok().put("time", time);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TimeEntity time) {
        timeService.save(time);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TimeEntity time) {
        timeService.updateById(time);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        timeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

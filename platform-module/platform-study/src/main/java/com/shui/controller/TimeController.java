package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.TimeEntity;
import com.shui.service.TimeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
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
@Api(tags = "学习-用户学习时常表")
public class TimeController {
    @Autowired
    private TimeService timeService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return timeService.queryPage(params);
    }

    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public TimeEntity info(@PathVariable("id") Long id) {
        return timeService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody TimeEntity time) {
        timeService.save(time);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody TimeEntity time) {
        timeService.updateById(time);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        timeService.removeByIds(Arrays.asList(ids));
    }

}

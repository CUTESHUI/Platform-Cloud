package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.ViewLogEntity;
import com.shui.service.ViewLogService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 学习-用户学习浏览记录表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-13 23:42:33
 */
@RestController
@RequestMapping("ViewLog")
@Api(tags = "学习-用户学习浏览记录表")
public class ViewLogController {
    @Autowired
    private ViewLogService viewLogService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return viewLogService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public ViewLogEntity info(@PathVariable("id") Long id) {
        return viewLogService.getById(id);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public void save(@RequestBody ViewLogEntity viewLog) {
        viewLogService.save(viewLog);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody ViewLogEntity viewLog) {
        viewLogService.updateById(viewLog);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        viewLogService.removeByIds(Arrays.asList(ids));
    }

}

package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.MemberDetailEntity;
import com.shui.service.MemberDetailService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员-会员表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:15:16
 */
@RestController
@RequestMapping("MemberDetail")
@Api(tags = "会员-会员表")
public class MemberDetailController {
    @Autowired
    private MemberDetailService memberDetailService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return memberDetailService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public MemberDetailEntity info(@PathVariable("id") Long id) {
        return memberDetailService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody MemberDetailEntity memberDetail) {
        memberDetailService.save(memberDetail);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody MemberDetailEntity memberDetail) {
        memberDetailService.updateById(memberDetail);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        memberDetailService.removeByIds(Arrays.asList(ids));
    }

}

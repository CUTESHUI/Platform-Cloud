package com.shui.controller;

import com.shui.common.utils.PageUtils;
import com.shui.entity.ChanelAccessTokenEntity;
import com.shui.service.ChanelAccessTokenService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 渠道-认证表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:22:36
 */
@RestController
@RequestMapping("ChanelAccessToken")
@Api(tags = "渠道-认证表")
public class ChanelAccessTokenController {
    @Autowired
    private ChanelAccessTokenService chanelAccessTokenService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        return chanelAccessTokenService.queryPage(params);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public ChanelAccessTokenEntity info(@PathVariable("id") Long id) {
        return chanelAccessTokenService.getById(id);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public void save(@RequestBody ChanelAccessTokenEntity chanelAccessToken) {
        chanelAccessTokenService.save(chanelAccessToken);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public void update(@RequestBody ChanelAccessTokenEntity chanelAccessToken) {
        chanelAccessTokenService.updateById(chanelAccessToken);
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public void delete(@RequestBody Long[] ids) {
        chanelAccessTokenService.removeByIds(Arrays.asList(ids));
    }

}

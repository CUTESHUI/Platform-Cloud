package com.shui.controller;

import java.util.Arrays;
import java.util.Map;

import com.shui.entity.ChanelAccessTokenEntity;
import com.shui.service.ChanelAccessTokenService;
import com.shui.common.utils.PageUtils;
import com.shui.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 渠道-认证表
 *
 * @author shui
 * @email shingshuilau701@gmail.com
 * @date 2021-06-14 00:22:36
 */
@RestController
@RequestMapping("ChanelAccessToken")
public class ChanelAccessTokenController {
    @Autowired
    private ChanelAccessTokenService chanelAccessTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = chanelAccessTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ChanelAccessTokenEntity chanelAccessToken = chanelAccessTokenService.getById(id);

        return R.ok().put("chanelAccessToken", chanelAccessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChanelAccessTokenEntity chanelAccessToken){
		chanelAccessTokenService.save(chanelAccessToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChanelAccessTokenEntity chanelAccessToken){
		chanelAccessTokenService.updateById(chanelAccessToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		chanelAccessTokenService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

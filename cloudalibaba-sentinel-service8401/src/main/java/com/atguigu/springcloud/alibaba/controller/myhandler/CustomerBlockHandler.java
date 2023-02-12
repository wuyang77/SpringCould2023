package com.atguigu.springcloud.alibaba.controller.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义限流处理信息.... CustomerBlockHandler --- 1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2022,"自定义限流处理信息.... CustomerBlockHandler --- 2");
    }

}

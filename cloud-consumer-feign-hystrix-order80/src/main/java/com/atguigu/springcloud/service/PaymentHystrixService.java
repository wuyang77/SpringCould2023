package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
/*
    fallback属性：指定包含了当前接口中方法的降级方法的类的类型
    业务逻辑层每个业务对应一个兜底方法很容易造成，业务逻辑的混乱，代码膨胀和耦合，
    我们需要在服务层增加一个PaymentFallbackService方法,在注解@FeignClient中增加一个属性fallback,其值为该方法的反射值
    解决了代码膨胀和代码耦合的问题
 */
@FeignClient(value = "cloud-hystrix-payment-service",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);
    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}



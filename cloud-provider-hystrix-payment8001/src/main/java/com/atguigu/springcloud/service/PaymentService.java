package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String payment_Timeout(Integer id);
    String paymentCircuitBreaker(Integer id);

}

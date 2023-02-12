package com.atguigu.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootConfiguration
public class GetRestTemplateConfig {
    @LoadBalanced //使用Ribbon实现负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

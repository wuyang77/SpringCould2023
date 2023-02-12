package com.atguigu.springcloud;

import com.atguigu.myrule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient //声明当前模块为Eureka注册中心的客户端
@SpringBootApplication
@RibbonClient(name = "cloud-payment-service",configuration = MyRuleConfig.class)//通过创建一个配置类修改负载均衡的策略
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}

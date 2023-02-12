package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyRuleConfig {
    //返回随机的实现类的对象
    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}

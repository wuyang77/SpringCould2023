package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class FeignLoggerLevelConfig {

    @Bean
    public Logger.Level getLoggerLevel(){
        return Logger.Level.FULL;
    }
}

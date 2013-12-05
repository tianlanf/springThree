package com.thoughtworks.yafei.config;

import com.thoughtworks.yafei.Fruit.Fruit;
import com.thoughtworks.yafei.Fruit.impl.Peach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="someName")
    public Fruit fruit() {
        return new Peach();
    }
}


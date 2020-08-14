package com.jay.template.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jay on 2020/8/6.
 */
@Configuration
@MapperScan("com.jay.template.dao")
public class MyBatisConfig {
}

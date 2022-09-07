package com.greedy.crud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.greedy.crud")
public class MybatisConfig {
}

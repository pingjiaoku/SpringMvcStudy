package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @time: 8/11/2022 14:33
 */
@Configuration
@ComponentScan({"com.itheima.dao", "com.itheima.domain","com.itheima.service"})
public class SpringConfig {
}

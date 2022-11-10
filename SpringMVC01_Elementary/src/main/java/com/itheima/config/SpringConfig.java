package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @time: 5/11/2022 22:08
 */
@Configuration
@ComponentScan({"com.itheima.dao", "com.itheima.service"})
public class SpringConfig {
}

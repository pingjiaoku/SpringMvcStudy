package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @time: 7/11/2022 17:33
 */
@Configuration
@ComponentScan({"com.itheima.domain","com.itheima.service","com.itheima.dao",})
public class SpringConfig {
}

package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:
 * @time: 7/11/2022 17:33
 */
@Configuration
@ComponentScan("com.itheima.controller")
@EnableWebMvc // 解决请求参数乱码
public class SpringMvcConfig {
}

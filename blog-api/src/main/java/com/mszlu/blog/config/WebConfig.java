package com.mszlu.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig
 * @Description TODO
 * @Author jiaomf
 * @Date 2021/8/14 17:27
 * @Version 1.0
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        //跨域设置，不可以设置为*，不安全，前后端分离项目，可能域名不一致
        //本地测试 端口不一致，也算跨域
        registry.addMapping("/**").allowedOrigins("http://location:8080");
    }

}

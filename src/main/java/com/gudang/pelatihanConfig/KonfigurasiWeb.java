/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudang.pelatihanConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author lucky
 */
@Configuration
@EnableWebMvcSecurity
public class KonfigurasiWeb extends WebMvcConfigurerAdapter{
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //jika tidak mau bikin controller bisa set di sini
        registry.addViewController("/login").setViewName("login");
        //registry.addViewController("/member/list").setViewName("/member/master-member");
        registry.addViewController("/category/master").setViewName("/category/master-category");
    }

    //settingan jika menggunakan themeleaf
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ThymeleafLayoutInterceptor());
//    }
    
    
}

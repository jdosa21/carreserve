package com.car.car.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

  // 요청 - 뷰 연결
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/reserve").setViewName("reserve");
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/admin").setViewName("admin");
    registry.addViewController("/signup").setViewName("signup");
  }
}

package com.credmarg.test.configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public interface WebConfigI {
    //    @Bean
    //    public WebMvcConfigurer corsConfigurer() {
    //        return new WebMvcConfigurer() {
    void addCorsMapping(CorsRegistry corsRegistry);
}

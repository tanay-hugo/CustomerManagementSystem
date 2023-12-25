package com.tanay.cms.config;

import com.tanay.cms.filters.NewFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewFilterConfig {
    @Bean
    public FilterRegistrationBean<NewFilter> registrationBean(){
        FilterRegistrationBean<NewFilter> registrationbean = new FilterRegistrationBean<>();
        registrationbean.setFilter(new NewFilter());
        registrationbean.addUrlPatterns("/customers/*");
        return registrationbean;
    }
}

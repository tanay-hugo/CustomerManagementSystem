package com.tanay.cms.filters;

import jakarta.servlet.*;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class NewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("New Filter is Working >> ");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
// problem ->  this filter is running on all URLs after configuration

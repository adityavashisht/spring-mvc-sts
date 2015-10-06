package com.indasil.springmvc.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by vashishta on 10/6/15.
 */
public class AllRequestProcessFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}

package filter;


import jakarta.servlet.*;

import java.io.IOException;

public class LifeCycleFilter implements Filter {
    /**
     *      * 构造 构造器
     *      * 初始化
     *      * 过滤，销毁
     */

    public LifeCycleFilter(){
        System.out.println("start");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤方法");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}

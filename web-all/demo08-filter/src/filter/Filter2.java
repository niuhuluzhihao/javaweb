package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter("/*")
public class Filter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filtered before doFilter invoked");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Filter1 after  dofilter invoked");
    }
}

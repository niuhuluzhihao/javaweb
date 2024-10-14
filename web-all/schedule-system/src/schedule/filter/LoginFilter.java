package schedule.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import schedule.pojo.SysUser;

import java.io.IOException;

@WebFilter(urlPatterns = {"/showSchedule.html","/schedule/*"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 获取session对象
        HttpSession session = request.getSession();
        SysUser user = (SysUser) session.getAttribute("sysUser");
        if (null == user){
            response.sendRedirect("/login.html");
        }else{
            filterChain.doFilter(request,response);
        }



        // 从session中获取登录的用户对象
        //没登录过login.html

        //登陆过放行
    }
}

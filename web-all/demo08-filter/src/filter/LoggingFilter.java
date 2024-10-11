package filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志过滤器
 * 实现Filter接口
 * 重写过滤方法
 * 配置过滤器
 *  web.xml
 *  注解的方式
 */
public class LoggingFilter implements Filter {

    private SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 过滤请求和响应的方法
     * 请求到达目标资源之前，先经过该方法
     * 该方法有能力控制请求收费继续向后到达目标资源，可以在方法内直接向客户端做响应处理
     * 请你去到达目标资源后，响应之前，还会经过该方法
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 请求到达目标资源之前的功能代码
            // 判断是否登录
            // 校验权限是否满足
            //
        System.out.println("logging filter before dofilter");
        String requestURI = request.getRequestURI();
        String dataTime = dataFormat.format(new Date());
        String beforeLogin = requestURI + "在" + dataTime + "被访问了";
        long t1 = System.currentTimeMillis();
        // 放行代码
        filterChain.doFilter(servletRequest,servletResponse);
        long t2 = System.currentTimeMillis();
        // 响应之前 HTTPServletResponse，转换为响应报文之前的功能代码
        System.out.println("logging filter after dofilter");
        String afterLogin = requestURI + "资源在在" + dataTime + "请求耗时"+(t2-t1)+"毫秒";
        System.out.println(afterLogin);

    }
}

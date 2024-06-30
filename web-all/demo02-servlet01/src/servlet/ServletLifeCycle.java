package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * 实例化   --------构造器  第一次请求
 * 初始化   -----一init     构造完毕
 * 接受请求，处理请求   ---service   ，每次请求
 * 销毁     destory    关闭服务
 *
 *
 * Servlet在tomcat中是单例的
 * 所以servlet在多个线程中是共享的
 * 不建议在service中修改成员变量， 在并发请求的时候，会引发线程安全问题
 *
 *
 *
 *
 *
 *
 *
 * default-servlet
 *
 */




@WebServlet(value = "/servletLifeStyle",loadOnStartup = 6)
public class ServletLifeCycle extends HttpServlet {

    public ServletLifeCycle(){
        System.out.println("构造器");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("f服务");
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }
}

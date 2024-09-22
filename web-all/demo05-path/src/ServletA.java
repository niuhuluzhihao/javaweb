import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 以下为重定向的处理

        // 重定向到ServletB

        // 相对路径
            //和前端处理相对路径规划一致
        // 绝对路径
            // 和前端处理一致  基本路径是localhost:8080

        // 相对路径写法
//        resp.sendRedirect("ServletB");

        // 绝对路径写法
//        resp.sendRedirect("/demo05/ServletB");
//        String contextPath = req.getServletContext().getContextPath();
//        resp.sendRedirect(contextPath +"/servletB");


        //以下是请求转发的处理 -----服务端行为,客户端不感知
         // 相对路径 ---和前端处理
        // req.getRequestDispatcher("ServletB").forward(req,resp);


        // 绝对路径（只有请求转发才会加） ---1、请求转发不需要添加项目上下文  2、 请求转发基本路径是 localhost:8080/demo05

        req.getRequestDispatcher("ServletB").forward(req,resp);

        // 对于绝对路径，可以不设置项目上下文 。也就是edit configure中的application context 设置为 /



    }
}

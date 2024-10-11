package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接受请求的username参数
        String username = req.getParameter("username");


        // 获得session对象
        HttpSession session = req.getSession();
        // session的时效性
        session.setMaxInactiveInterval(120);
        System.out.println(session.getId());
        System.out.println(session.isNew());
        //判断请求中有咩有特殊的cookie
            //有
                // sessiondid找session对象
                    //找到了
                    // 没有找到
            //没有
                // 创建

        // 将username存入session
        session.setAttribute("username",username);
        // 客户端响应信息
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("成功");



    }
}

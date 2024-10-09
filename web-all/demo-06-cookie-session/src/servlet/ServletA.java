package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/servletA")
public class ServletA extends HttpServlet {

    // 创建cookie
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("keyA","valueA");
        // 设置cookie的持久化时间
        cookie1.setMaxAge(60*5);
        cookie1.setPath("/servletB");
        Cookie cookie2 = new Cookie("keyb", "valueB");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}

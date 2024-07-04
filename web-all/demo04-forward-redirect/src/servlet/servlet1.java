package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1 执行了");

//        String money = req.getParameter("money");
//        System.out.println(money);

        // 请求转发给servlet2
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("servlet2");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/b.html");
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");

        // 让请求其作出转发动作
        requestDispatcher.forward(req,resp);


    }
}

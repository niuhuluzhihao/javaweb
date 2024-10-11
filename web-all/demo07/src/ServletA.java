import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 向请求域存放数据
        req.setAttribute("request","requestMessage");
        // 向会话域存放对象
        HttpSession session = req.getSession();
        session.setAttribute("session","sessionMessage");
        // 向应用域存放对象
        ServletContext application = getServletContext();
        application.setAttribute("application","applicationMessage");

        // 获取请求数据
        String reqMessages = (String) req.getAttribute("request");
        System.out.println("请求域"+reqMessages);

        // 请求转发
        req.getRequestDispatcher("servletB").forward(req,resp);
    }
}

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/View1Servlet")
public class View1Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 请求转发
        //      请求转发不可以基于当前资源的的路径
        //   准确来说是应该参照客户端的路径来请求
        req.getRequestDispatcher("/WEB-INF/views/view1.html").forward(req,resp);
    }
}

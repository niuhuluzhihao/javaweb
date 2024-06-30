package servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * servlet开发流程
 * 创建javaweb项目，同时将tomcat项目添加为当前依赖
 * 重写service方法，service(httpservletrequest,httpservletresponse resp)
 * 在service方法中，定义业务处理代码
 *在web.xml中配置servelt对应的请求映射路径
 *
 *
 * servlet_api.jar 导入问题
 *  编码的时候需要，运行的时候，在服务器的环境中，由服务软件tomcat提供
 *  因此，在我们的javaweb项目中，在打包\构建的时候，无需携带servlet-api的jar包
 * content-type响应头问题
 *  MIME类型响应头    媒体类型，文件类型，响应的数据类型
 *
 */


@WebServlet("/user1")
public class UserHttpServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从request对象获取请求中任何信息
        String username = req.getParameter("username");
        // 处理业务的代码
        String info = "yes";
        if ("atguigu".equals(username)){
            info = "no";
        }
        // 将要响应的数据放入response就可以了
        // 应该设置content-type内容
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
//        resp.setHeader("Content-Type","text/html");
        writer.write(info);


    }
}

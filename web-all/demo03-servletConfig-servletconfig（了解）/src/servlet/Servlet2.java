package servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


// 可以部署成功，但是连接不到
//@WebServlet(name = "/servlet2",urlPatterns = "/servlet2")
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("start1");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ServletContext servletContext = new
        System.out.println("--serverletconfig  ------ 获取参数");
        ServletConfig servletConfig = getServletConfig();
        String keya = servletConfig.getInitParameter("keya");
        System.out.println("keys"+keya);

        Enumeration<String> initParameterNmaes = servletConfig.getInitParameterNames();
        while (initParameterNmaes.hasMoreElements()){
            String name = initParameterNmaes.nextElement();
            System.out.println(name + "=" + getInitParameter(name));
        }

        System.out.println("--------------ServletContext获取参数 ------");
        ServletContext servletContext1 = servletConfig.getServletContext();
        ServletContext servletContext2 = req.getServletContext();
        ServletContext servletContext3 = getServletContext();

        System.out.println(servletContext1 == servletContext2);
        System.out.println(servletContext3 == servletContext2);

        String encoding = servletContext1.getInitParameter("encoding");
        System.out.println("encoding "+encoding);

        Enumeration<String> parameterNames = servletContext1.getInitParameterNames();
        while(parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name +"="+servletContext1.getInitParameter(name));
        }

        //向域对象中设置数据
        servletContext1.setAttribute("ka","va");

        // 从域对象中读取数据
        String ka = (String) servletContext1.getAttribute("ka");




    }



}

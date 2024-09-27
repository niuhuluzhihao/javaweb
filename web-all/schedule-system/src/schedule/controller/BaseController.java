package schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;

public class BaseController extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String[] split = requestURI.split("/");
        String methodName = split[split.length - 1];
        // 使用反射通过方法名获取下面的方法，看不懂
        Class aClass = this.getClass();
        try{
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 暴力破解---当方法的限制是private的时候
            declaredMethod.setAccessible(true);

            //执行代码
            declaredMethod.invoke(this, req, resp);


        }catch (Exception e){
            e.printStackTrace();
        }
//        if (methodName.equals("add")) {
//            this.add(req,resp);
//            //增加处理
//        } else if (methodName.equals("find")) {
//            //查询
//        } else if (methodName.equals("update")) {
//            // 修改
//        } else if (methodName.equals("remove")) {
//
//        }
    }

}

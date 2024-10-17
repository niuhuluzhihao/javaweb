package schedule.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import schedule.common.Result;
import schedule.common.ResultCodeEnum;
import schedule.pojo.SysUser;
import schedule.service.SysUserService;
import schedule.service.impl.SysUserServiceImpl;
import schedule.utils.MD5Util;

import java.io.IOException;


@WebServlet("/user/*")
public class SysUserController extends BaseController {

    private SysUserService userService = new SysUserServiceImpl();


    protected void checkUsername(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        SysUser sysUser = userService.findByUsername(username);
        Result result = Result.ok(null);
        if(null !=sysUser ){
            result = Result.build(null, ResultCodeEnum.USERNAME_USERD);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String info = objectMapper.writeValueAsString(result);
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().write(info);

    }



    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、 接受客戶端接受的參數
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2、調用服務端的方法，完成注册功能
        SysUser sysUser = new SysUser(username, userPwd,null);
//        userService.regist(username, userPwd);
        int rows = userService.regist(sysUser);
        System.out.println(rows);
        // 只要重定向就不要请求转发
        if (rows >0){
            // 这是绝对路径的写法
            resp.sendRedirect("/registSuccess.html");
        }else{
            resp.sendRedirect("/registFail.html");
        }

    }


    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、 接受客戶端接受的參數
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2、調用服務端的方法，跟据用戶查詢用戶信息
        SysUser loginUser = userService.findByUsername(username);
        System.out.println("username is " + username);
        if (null == loginUser){
            resp.sendRedirect("/loginUsernameError.html");
        } else if (! MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())) {
            resp.sendRedirect("/loginUserPwdError.html");
        }else{
            // 登录成功之后，将登录的用户信息放入session
            HttpSession session = req.getSession();
            session.setAttribute("sysUser",loginUser);
            resp.sendRedirect("/showSchedule.html");
        }



        SysUser sysUser = new SysUser(username, userPwd,null);
//        userService.regist(username, userPwd);
        int rows = userService.regist(sysUser);
        System.out.println("其他字符串 " + rows);
        // 只要重定向就不要请求转发
        if (rows >0){
            // 这是绝对路径的写法
            resp.sendRedirect("/registSuccess.html");
        }else{
            resp.sendRedirect("/registFail.html");
        }

    }
}

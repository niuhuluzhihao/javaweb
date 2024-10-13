package listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class MyApplicationListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext appplication = sce.getServletContext();
        System.out.println(appplication.hashCode()+"应用被初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext appplication = sce.getServletContext();
        System.out.println(appplication.hashCode()+"应用被销毁了");       }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key= scae.getName();
        Object value = scae.getValue();
        System.out.println(application.hashCode()+"应用域增加了"+key+"value"+value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key= scae.getName();
        Object value = scae.getValue();  // 获取旧的值
        System.out.println(application.hashCode()+"应用域移除了"+key+"value"+value);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        ServletContext application = scae.getServletContext();
        String key= scae.getName();
        Object value = scae.getValue();  // 获取旧的值
        Object newValue = application.getAttribute(key);   // 获取新的值
        System.out.println(application.hashCode()+"应用域修改了"+key+"value"+value+"新的值是"+newValue);
    }
}

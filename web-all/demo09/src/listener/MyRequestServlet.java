package listener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class MyRequestServlet implements ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // 请求域移除数据都会触发该方法的执行
        ServletRequestListener.super.requestDestroyed(sre);
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // 请求域移除数据都会触发该方法的执行

        ServletRequestListener.super.requestInitialized(sre);
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // 请求域增加数据都会触发该方法的执行

        ServletRequestAttributeListener.super.attributeAdded(srae);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // 请求域移除数据都会触发该方法的执行

        ServletRequestAttributeListener.super.attributeRemoved(srae);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // 请求域修改数据都会触发该方法的执行

        ServletRequestAttributeListener.super.attributeReplaced(srae);
    }
}

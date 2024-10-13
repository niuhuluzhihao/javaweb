package listener;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListenr implements HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // session域对象都会触发该方法的执行
        HttpSessionListener.super.sessionCreated(se);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // session域对象都会销毁该方法的执行

        HttpSessionListener.super.sessionDestroyed(se);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        // session域增加了数据都会触发该方法的执行

        HttpSessionAttributeListener.super.attributeAdded(se);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        // session域移除数据都会触发该方法的执行
        HttpSessionAttributeListener.super.attributeRemoved(se);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        // session域修改数据都会触发该方法的执行
        HttpSessionAttributeListener.super.attributeReplaced(se);
    }
}

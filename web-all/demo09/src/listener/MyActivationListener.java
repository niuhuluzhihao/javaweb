package listener;

import jakarta.servlet.http.HttpSessionActivationListener;
import jakarta.servlet.http.HttpSessionEvent;

public class MyActivationListener implements HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        // session对象即将钝化之前执行
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {

        HttpSessionActivationListener.super.sessionDidActivate(se);
    }
}

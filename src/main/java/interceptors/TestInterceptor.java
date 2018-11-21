package interceptors;

import model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestInterceptor extends HandlerInterceptorAdapter {
    @Override public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
        Exception ex) throws Exception {
       if(request.getRequestURI().contains("/check-user")){
           System.out.println("afterCompletion");
       }
    }

    /**
     * данный функционал можно использовать например для определения, является ли пришедший юзер админом,
     * и перенаправлению на страницу с ошибкой
     * **/
    @Override public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        System.out.println(request.getRequestURI());
        if(request.getRequestURI().contains("/check-user")){
            System.out.println("pre Handle:");
        }
        return super.preHandle(request, response, handler);
    }

    @Override public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
        ModelAndView modelAndView) throws Exception {
        if(request.getRequestURI().contains("/check-user")){
            System.out.println("post Handle:");
        }
    }
}

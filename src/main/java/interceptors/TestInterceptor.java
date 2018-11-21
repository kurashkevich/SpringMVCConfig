package interceptors;

import model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Интерсепторы используются, для перехвата, обработки и изменения.
 *
 * PreHandle - обработка до отработки контроллера
 * PostHndle - обработка после обработки контроллера
 * afterCompletion - обработка после обработки контроллера и после того как уже сформирована вьюха
 *
 * Отличия от фильтров:
 * 1. Возможность работать напрямую с объектами(моделями). С помощью фильтра такая реализация сложнее
 * 2. Доступ к контроллерам
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-config-interceptors
 *
 * **/
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
            User user = (User) modelAndView.getModel().get("user");
            System.out.println("post Handle:" + user.getEmail());
        }
    }
}

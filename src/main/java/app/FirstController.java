package app;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {
    @GetMapping("/welcome") public String helloWorld(Model model) {
        model.addAttribute("msg", "MEGA CD BOOK STORE");
        return "index";
    }

    /**
     * ResponseBody - напрямую записывает ответ в элемент Body ы странице HTML
     *
     * **/
    @RequestMapping(value = "/get-json-user" , method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User getJsonUser(@RequestParam("email") String email){
        System.out.println("sudoi");
        User user = new User();
        user.setEmail(email);
        return user;
    }

}

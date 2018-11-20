package app;

import com.sun.org.apache.xpath.internal.operations.Mod;
import model.User;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    static final Logger logger = Logger.getLogger(RegistrationController.class);

    @GetMapping("") public String sign() {
        BasicConfigurator.configure();
        return "signIn";
    }

    @GetMapping("/newUser")
    public ModelAndView getRegistrationForm() {
        User user = new User();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        modelAndView.addObject(user);
        return modelAndView;
    }

    @PostMapping("/check-user")
    public ModelAndView checkUser(@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("check-user");
        modelAndView.addObject(user);
        return modelAndView;
    }


}

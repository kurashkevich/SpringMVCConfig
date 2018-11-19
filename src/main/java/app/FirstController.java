package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {
    @GetMapping("/welcome") public String helloWorld(Model model) {
        model.addAttribute("msg", "hello model");
        return "welcome";
    }

}

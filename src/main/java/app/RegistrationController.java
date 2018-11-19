package app;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

    @GetMapping("/registration") public String getRegistrationForm() {
        return "registration";
    }
}

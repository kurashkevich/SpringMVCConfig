package app;

import model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping(value = "/greeting")
    public User greeting(@RequestParam(value="email", defaultValue="v.kur@gmail.com") String email) {
        User user = new User(email, "asd");
        System.out.println(user);
        return user;
    }
}

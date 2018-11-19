package app;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    static final Logger logger = Logger.getLogger(RegistrationController.class);

    @GetMapping("/registration") public String getRegistrationForm() {
        BasicConfigurator.configure();
        logger.debug("registration controller is working!");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");
        return "registration";
    }
}

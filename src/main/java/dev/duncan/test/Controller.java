package dev.duncan.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "test")
    public String report() {
        return "I'm functional!!";
    }

}

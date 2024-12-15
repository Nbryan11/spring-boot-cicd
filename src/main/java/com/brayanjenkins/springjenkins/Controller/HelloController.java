package com.brayanjenkins.springjenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String getMessage() {

        return "Hello World desde docker";
    }
}

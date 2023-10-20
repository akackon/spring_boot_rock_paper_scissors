package com.spring_boot_rock_paper_scissors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


}

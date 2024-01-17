package com.spring_boot_rock_paper_scissors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/game")
    public String game() {
        return "index";
    }
}
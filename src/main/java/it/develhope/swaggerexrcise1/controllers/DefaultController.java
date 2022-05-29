package it.develhope.swaggerexrcise1.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping(value = "")
    public String welcomeMessage(){
        return "welcome to the jungle";
    }
}

package it.develhope.swaggerexrcise1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class ArturoController {

    @GetMapping(value = "")
    public String getName(){
        return "My name is Arturo";
    }

}

package be.ipeters.springboot_react.controllers;

/* carlpeters created on 16/07/2024 inside the package - be.ipeters.springboot_react.controllers */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String Home(){
        return "Welcome To ToDo App";
    }
}

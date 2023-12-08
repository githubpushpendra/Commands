package com.render.springrender;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String test(){
        return "Dear devotee! Welcome to the application";
    }
}

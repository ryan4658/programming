package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {
    @GetMapping("/")
    public String sample(){
        return "index";
    }
    @GetMapping("/move/{dir}/{page}")
    public String move(@PathVariable String dir, 
                        @PathVariable String page){
        return String.format("%s/%s", dir, page);
    }

    
}

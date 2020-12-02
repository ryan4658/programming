package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        System.out.println("서버 시작!!!");
        return "index";
    }

    @GetMapping("/forms/{dir}/{fname}")
    public String move(@PathVariable String dir, @PathVariable String fname){
        System.out.println("이동하려는 디렉토리: "+dir);
        System.out.println("이동하려는 파일명: "+fname);
        return String.format("%s/%s", dir, fname);
    }
    


}

package com.example.recipebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/photoGallery")
    public String photoG(){
        return "photoGallery";
    }
}

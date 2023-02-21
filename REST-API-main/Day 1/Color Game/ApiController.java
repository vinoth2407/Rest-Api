package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{
    @GetMapping("/")
    public String getMyFav(){
        String yourFavColor="Green";
        return "My favorite color is "+ yourFavColor;
    }
}
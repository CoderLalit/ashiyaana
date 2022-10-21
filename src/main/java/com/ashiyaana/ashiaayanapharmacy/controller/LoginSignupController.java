package com.ashiyaana.ashiaayanapharmacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginSignupController {
    
    @RequestMapping("/login-signup")
    public String showLoginSignupPage(){
        return "loginsignup.html";
    }
}

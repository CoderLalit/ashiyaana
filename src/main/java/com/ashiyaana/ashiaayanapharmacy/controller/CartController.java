package com.ashiyaana.ashiaayanapharmacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    
    @RequestMapping("/cart")
    public String showCart(){
        return "cart.html";
    }
}

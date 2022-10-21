package com.ashiyaana.ashiaayanapharmacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductPageController {
    
    @RequestMapping("/products")
    public String showProducts(){
        return "productsearch.html";
    }

    @RequestMapping("/product-details")
    public String showProductDetails(){
        return "productdetails.html";
    }
}

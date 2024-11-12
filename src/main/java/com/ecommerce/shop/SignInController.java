package com.ecommerce.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/signIn")
    public String sign_in(Model model){
        return "SignInWindow";
    }
}

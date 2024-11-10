package com.ecommerce.shop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message", "Ты на главной странице!!!");
        return "home";
    }
}

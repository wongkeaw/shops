package com.driveto.shops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @GetMapping("/order")
    public String main(Model model) {
        model.addAttribute("message", "message");
        return "order";
    }

    // /hello?name=kotlin
    @GetMapping("/order/make")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "xxx") String name, Model model) {

        model.addAttribute("message", name);

        return "welcome";
    }

}
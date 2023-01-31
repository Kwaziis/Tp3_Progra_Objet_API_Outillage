package com.tp_poo_apis.tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String
                                   nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "greeting";
    }
    @GetMapping("/addresses")
    public String addresses(@RequestParam(name="name", required=false, defaultValue="World") String
                                   nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "addresses";
    }
    @GetMapping("/addresse")
    public String addresse(@RequestParam(name="name", required=false, defaultValue="World") String
                                    nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);
        return "addresse";
    }
}
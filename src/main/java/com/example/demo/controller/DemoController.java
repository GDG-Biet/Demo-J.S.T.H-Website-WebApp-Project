package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.DemoModel;
import com.example.demo.service.DemoService;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
        DemoModel user = demoService.findUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            ModelAndView mav = new ModelAndView("index");
            mav.addObject("message", "Login successful");
            mav.addObject("name", user.getUsername());
            return mav;
        } else {
            ModelAndView mav = new ModelAndView("login");
            mav.addObject("message", "Invalid username or password");
            return mav;
        }
    }

    @GetMapping("/signup")
    public ModelAndView signup() {
        ModelAndView mav = new ModelAndView("signup");
        mav.addObject("user", new DemoModel());
        return mav;
    }

    @PostMapping("/signup")
    public ModelAndView signup(@ModelAttribute DemoModel user) {
        demoService.saveUser(user);
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("message", "Signup successful");
        return mav;
    }
}
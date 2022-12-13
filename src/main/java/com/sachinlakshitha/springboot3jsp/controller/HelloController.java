package com.sachinlakshitha.springboot3jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("name", "Sachin");
        return mav;
    }
}

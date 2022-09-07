package com.piment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "test")
public class TestController {
    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public ModelAndView getDetail(
            ModelAndView modelAndView
    ) {
        modelAndView.setViewName("article/detail");
        return modelAndView;
    }
}

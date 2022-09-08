package com.piment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "com.piment.controllers.RootController")
@RequestMapping(value = "/")
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex(
            ModelAndView modelAndView) {
        modelAndView.setViewName("root/index");
        return modelAndView;
    }
}

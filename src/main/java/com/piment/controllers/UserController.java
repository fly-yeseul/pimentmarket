package com.piment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "com.piment.controllers.UserController")
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public ModelAndView getMy(
            ModelAndView modelAndView
    ) {
        modelAndView.setViewName("user/register");
        return modelAndView;
    }
}
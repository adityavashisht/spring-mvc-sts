package com.indasil.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 10/6/15.
 */
@Controller
public class LandingController {


    @RequestMapping(value="/landing",method = RequestMethod.GET)
    public String get() {
        return "landing";
    }

    @RequestMapping(value="/pageTwo",method = RequestMethod.GET)
    public String two() {
        return "two";
    }

}

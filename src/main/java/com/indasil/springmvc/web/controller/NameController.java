package com.indasil.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 10/6/15.
 */
@Controller
@RequestMapping("/name/form")
public class NameController {

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model) {

        NameForm nameForm = new NameForm();
        nameForm.setName("XYZ");

        model.addAttribute("nameForm", nameForm);

        return "/name/form";
    }

    /**
     *
     * @param nameForm
     * @param modelMap
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String post(@ModelAttribute("nameForm") NameForm nameForm, ModelMap modelMap) {

        modelMap.addAttribute("name", nameForm.getName());
        return "/name/show";
    }


}

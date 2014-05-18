package com.classifieds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class BaseController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHome(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Classifieds");
		
		return modelAndView;
	}
}

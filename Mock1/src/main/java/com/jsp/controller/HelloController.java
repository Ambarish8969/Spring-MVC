package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello1")
	public ModelAndView hello1() {
		ModelAndView view = new ModelAndView("firstpage");
		view.addObject("hi", "first page");
		return view;
	}

	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		ModelAndView view = new ModelAndView("secondpage");
		view.addObject("hi", "second page");
		return view;
	}
}

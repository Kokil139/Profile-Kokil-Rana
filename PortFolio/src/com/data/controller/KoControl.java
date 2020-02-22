package com.data.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.data.user.User;

@Controller
@RequestMapping(value="/")
public class KoControl {
	
	@Autowired
	private User user;
@RequestMapping(method=RequestMethod.GET)
public ModelAndView welcome(){
	return new ModelAndView("kokil", "PortFolio", user.welcomeMessage());
}
	@RequestMapping(value="/kokilrana" ,method=RequestMethod.GET)
	public ModelAndView welcomeAgain(){
		return new ModelAndView("kokil", "PortFolio", user.welcomeAgainMessage());
}
}

 
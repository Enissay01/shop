package net.yassine.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView Home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("Name", "Yassine");
		
		
		return mv;
	}

}

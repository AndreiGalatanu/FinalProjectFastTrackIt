package com.fasttrackit.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class indexController {


	@RequestMapping(value = "tables.htm" , method=RequestMethod.GET)
	public ModelAndView getTables() {

		ModelMap map = new ModelMap();
		

		return new ModelAndView("tables", "model", map);


}
}

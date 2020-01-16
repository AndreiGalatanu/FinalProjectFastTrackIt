package com.fasttrackit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class indexController {


	@RequestMapping(value = "index.htm")
	public ModelAndView getIndex() {

		ModelMap map = new ModelMap();
		map.put("name", "Andrei");
		map.put("time", (new Date()).toString());

		return new ModelAndView("index", "model", map);


}
}

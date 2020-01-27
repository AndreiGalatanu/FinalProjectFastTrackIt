package com.fasttrackit.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasttrackit.DAO.WeekdayDAO;
import com.fasttrackit.pojo.Weekday;

@Controller
public class WeekController {

	@RequestMapping(value = "calendar.htm")
	public ModelAndView getCalendar() throws SQLException {

		ModelMap model = new ModelMap();
		WeekdayDAO wdao = new WeekdayDAO();
		ArrayList<Weekday> weekday = wdao.getWeekday();
		model.put("weekday", weekday);
		return new ModelAndView("calendar/calendar", "model", model);

	}

}

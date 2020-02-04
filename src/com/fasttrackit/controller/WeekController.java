package com.fasttrackit.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasttrackit.DAO.EmployeeDAO;
import com.fasttrackit.pojo.Employee;

@Controller
public class WeekController {

	@RequestMapping(value = "calendar.htm")
	public ModelAndView getEmployee() throws SQLException {
		ModelMap model = new ModelMap();
		EmployeeDAO edao = new EmployeeDAO();
		ArrayList<Employee> luni = edao.getLuni();
		model.put("luni", luni);
		ArrayList<Employee> marti = edao.getMarti();
		model.put("marti", marti);
		ArrayList<Employee> miercuri = edao.getMiercuri();
		model.put("miercuri", miercuri);
		ArrayList<Employee> joi = edao.getJoi();
		model.put("joi", joi);
		ArrayList<Employee> vineri = edao.getVineri();
		model.put("vineri", vineri);
		
		
		return new ModelAndView("calendar/calendar", "model", model);

	}
	
}

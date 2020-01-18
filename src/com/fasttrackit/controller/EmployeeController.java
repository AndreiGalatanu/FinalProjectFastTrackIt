package com.fasttrackit.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasttrackit.DAO.EmployeeDAO;
import com.fasttrackit.pojo.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "employee.htm")
	public ModelAndView getEmployee() throws SQLException {
		ModelMap model = new ModelMap();
		EmployeeDAO edao = new EmployeeDAO();
		ArrayList<Employee> employee = edao.getEmployee();
		model.put("employee", employee);
		return new ModelAndView("employee", "model", model);

	}

	@RequestMapping(value = "detalii/{employeeId}")
	public ModelAndView getEmployeeDetails(@PathVariable String employeeId) throws SQLException {

		EmployeeDAO edao = new EmployeeDAO();
		Employee employee = edao.getEmployeeById(employeeId);
		edao.getEmployeeById(employeeId);

		// punem obk pe model

		ModelMap model = new ModelMap();
		model.put("employee", employee);
		// trimitem model spre jsp
		return new ModelAndView("employee/detalii", "model", model);

	}

	@RequestMapping(value = "employeeAdd.htm")
	public ModelAndView displayAddForm(Model model) {

		Employee e = new Employee();

		model.addAttribute("employeeForm", e);

		return new ModelAndView("employee/add", "model", model);

	}

	@RequestMapping(value="addEmployee.htm", method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employeeForm") Employee employee, ModelMap model,
			BindingResult result) {
		try {
			EmployeeDAO edao = new EmployeeDAO();
			edao.createEmployee(employee);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return new ModelAndView("redirect:/employee.htm");
	}

}

package com.bhavana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhavana.model.Employee;
import com.bhavana.service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeService employeeService;
	
   @RequestMapping("/home")
   String home() {
	   return "home";
   }
   
   @RequestMapping("/listStudents")
   String getStudents(Model model) {
	   List<Employee> list = employeeService.getAllEmployee();
	   System.out.println(list);
	   model.addAttribute("listemployee", list);
	   return "listEployee";
   }
   
}
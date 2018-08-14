package com.javainuse.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.vo.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
//@Api(value = "TestController", description = "TestController")
public class TestController {
	@RequestMapping(method = RequestMethod.GET , value="/api/welcome")
	//@RequestMapping("/welcome.html")
	public @ResponseBody ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	@RequestMapping(value = "/getEmployee" ,  method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody List<Employee> test() {
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setEmployeeName("Shubhra");
		emp.setBranch("Banerjee_Cheers to life");
		employeeList.add(emp);
		
		return employeeList ;
	}

}

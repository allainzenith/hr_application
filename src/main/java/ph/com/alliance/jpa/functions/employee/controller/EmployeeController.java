package ph.com.alliance.jpa.functions.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.functions.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee") //sign

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/getall")
	public ApiResult getAllEmployees() {
		return ApiResult.CreateSuccess(employeeservice.getAllEmployees(), "Employees retrieved successfully");
	}
}


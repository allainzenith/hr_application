package ph.com.alliance.jpa.functions.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.entity.Employee;
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
	

	@PostMapping("/create")
	public ApiResult createEmployee(Employee employeemodel) {
		employeeservice.createEmployee(employeemodel);
		return ApiResult.CreateSuccess("Successfully created!");
	}

	@PutMapping("/update/{empID}")
	public ApiResult updateEmployee(@PathVariable Integer empID, Employee employeemodel) {
		employeeservice.updateEmployee(empID, employeemodel);
		return ApiResult.CreateSuccess("Successfully updated!");
	}
	
	@DeleteMapping("/delete/{empID}")
	public ApiResult deleteEmployee(@PathVariable Integer empID) {
		employeeservice.deleteEmployee(empID);
		return ApiResult.CreateSuccess("Successfully deleted!");
	}
	
	@GetMapping("/department/{department}")
	public ApiResult findByDepartment(@PathVariable String department) {
		employeeservice.findByDepartment(department);
		
		return ApiResult.CreateSuccess(employeeservice.findByDepartment(department), "Retrieved Successfully");
	}

}


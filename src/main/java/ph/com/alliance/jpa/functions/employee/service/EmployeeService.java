package ph.com.alliance.jpa.functions.employee.service;

import ph.com.alliance.jpa.entity.Employee;
import ph.com.alliance.jpa.functions.employee.model.EmployeeModel;

public interface EmployeeService {
	Object getAllEmployees();
	
	void createEmployee(Employee employeemodel);
	void updateEmployee(Integer empID, Employee employeemodel);
	void deleteEmployee(Integer empID);
	Object findByDepartment(String department);
	Object loginEmployee(EmployeeModel employeemodel);
}

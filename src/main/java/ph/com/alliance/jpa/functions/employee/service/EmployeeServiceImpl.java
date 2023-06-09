package ph.com.alliance.jpa.functions.employee.service;
	
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ph.com.alliance.jpa.entity.Employee;
import ph.com.alliance.jpa.functions.employee.dao.EmployeeDao;

import ph.com.alliance.jpa.functions.employee.dao.LoginEmployeeDao;
import ph.com.alliance.jpa.functions.employee.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;


	@Autowired
	LoginEmployeeDao loginemployeeDao;

	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employees = null;
		
		try {
			employees = employeeDao.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return employees;
	}
	
	@Override
	public void createEmployee(Employee employeemodel) {
		Employee employee = new Employee();
		
		try {
			BeanUtils.copyProperties(employee, employeemodel);
			employeeDao.saveAndFlush(employee);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void updateEmployee(Integer emplID, Employee employeemodel) {
		Employee employee = new Employee();
		
		try {
			BeanUtils.copyProperties(employee, employeemodel);
			employee.setEmpID(emplID);
			employeeDao.saveAndFlush(employee);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	public void deleteEmployee(Integer empID) {
		employeeDao.deleteById(empID);
	}
	
	@Override
	public List<Employee> findByDepartment(String department) {
		employeeDao.findByDepartment(department);
		
		List<Employee> employees = employeeDao.findByDepartment(department);
		return employees;
	}
	

	@Override
	public List<EmployeeModel> loginEmployee(EmployeeModel employeemodel) {
//		EmployeeModel employee = new EmployeeModel();
		
		loginemployeeDao.loginEmployee(employeemodel);
		
		List<EmployeeModel> employees = loginemployeeDao.loginEmployee(employeemodel);
		
		return employees;
	}
	


}

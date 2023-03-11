package ph.com.alliance.jpa.functions.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
}
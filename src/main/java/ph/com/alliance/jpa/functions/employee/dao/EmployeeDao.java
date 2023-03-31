package ph.com.alliance.jpa.functions.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	@Query(value="select * from jumpstartprogram2023.employee where department = :department", nativeQuery = true)
	List<Employee> findByDepartment(@Param(value = "department") String department);
}
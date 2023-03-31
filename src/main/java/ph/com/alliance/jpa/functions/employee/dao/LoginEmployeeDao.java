package ph.com.alliance.jpa.functions.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ph.com.alliance.jpa.functions.employee.model.EmployeeModel;

public interface LoginEmployeeDao extends JpaRepository<EmployeeModel, String>{
	@Query(value="select * from jumpstartprogram2023.employee where email = :#{#employeemodel.email} and password = :#{#employeemodel.password}", nativeQuery = true)
	List<EmployeeModel> loginEmployee(@Param("employee") EmployeeModel employeemodel);
}

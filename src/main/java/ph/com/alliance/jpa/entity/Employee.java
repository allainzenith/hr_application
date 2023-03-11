package ph.com.alliance.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	Integer empID;
	
	@Column(name = "emp_role")
	String emp_role;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "email")
	String email;
	
	@Column (name = "password")
	String password;
	
	@Column (name = "password_hashed")
	String password_hashed;
	
	@Column(name = "department")
	String department;

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_hashed() {
		return password_hashed;
	}

	public void setPassword_hashed(String password_hashed) {
		this.password_hashed = password_hashed;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	
	
	
	
}

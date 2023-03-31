package ph.com.alliance.jpa.functions.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeModel {
//	private String email;
//	
//	private String password;
//
//	public EmployeeModel() {
//	}
//	
//	public EmployeeModel(ph.com.alliance.jpa.entity.Employee e) {
//        this.setEmail(e.getEmail());
//        this.setPassword(e.getPassword());
//    }
//    
//    public ph.com.alliance.jpa.entity.Employee toEntity() {
//        ph.com.alliance.jpa.entity.Employee e = new ph.com.alliance.jpa.entity.Employee();
//        e.setEmail(this.getEmail());
//        e.setPassword(this.getPassword());
//        return e;
//    }
//    
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
//	@Id
//	Integer empID;
	
	@Id
	String email;
	
	@Column (name = "password")
	String password;

//	public Integer getEmpID() {
//		return empID;
//	}
//
//	public void setEmpID(Integer empID) {
//		this.empID = empID;
//	}

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
	
	
}

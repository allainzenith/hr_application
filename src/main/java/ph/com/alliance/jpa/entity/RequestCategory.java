package ph.com.alliance.jpa.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "request_category")
public class RequestCategory {
	@Id
	Integer categoryID;
	
	@Column(name = "categoryname")
	String categoryname;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "default_assignee")
	Integer default_assignee;

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDefault_assignee() {
		return default_assignee;
	}

	public void setDefault_assignee(Integer default_assignee) {
		this.default_assignee = default_assignee;
	}
}

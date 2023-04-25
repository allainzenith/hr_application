package ph.com.alliance.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	
	@Id
	Integer ticketID;
	
	@Column(name = "status")
	String status;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "category")
	String category;
	
	@Column (name = "assigned_to")
	Integer assigned_to;
	
	@Column (name = "empID")
	Integer empID;
	
	@Column(name = "subject")
	String subject;
	
	@Column(name = "attachment")
	String attachment;
	
	@Column(name = "created_at")
	String created_at;
	
	@Column(name = "priority")
	String priority;
	
	@Column(name = "date_needed")
	String 	date_needed;
	
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDate_needed() {
		return date_needed;
	}

	public void setDate_needed(String date_needed) {
		this.date_needed = date_needed;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(Integer assigned_to) {
		this.assigned_to = assigned_to;
	}

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
	public Integer getTicketID() {
		return ticketID;
	}

	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}

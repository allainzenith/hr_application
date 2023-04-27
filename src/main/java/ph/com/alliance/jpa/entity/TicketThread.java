package ph.com.alliance.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_thread")
public class TicketThread {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer ticketthreadID;
	
	@Column(name = "ticketID")
	Integer ticketID;
	
	@Column(name = "thread_content")
	String thread_content;
	
	@Column(name = "created_at")
	String created_at;
	
	@Column(name = "sent_by")
	Integer sent_by;

	@Column(name = "file_attachment")
	String file_attachment;

	public Integer getTicketthreadID() {
		return ticketthreadID;
	}

	public void setTicketthreadID(Integer ticketthreadID) {
		this.ticketthreadID = ticketthreadID;
	}

	public Integer getTicketID() {
		return ticketID;
	}

	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}

	public String getThread_content() {
		return thread_content;
	}

	public void setThread_content(String thread_content) {
		this.thread_content = thread_content;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Integer getSent_by() {
		return sent_by;
	}

	public void setSent_by(Integer sent_by) {
		this.sent_by = sent_by;
	}

	public String getFile_attachment() {
		return file_attachment;
	}

	public void setFile_attachment(String file_attachment) {
		this.file_attachment = file_attachment;
	}
	
	

}

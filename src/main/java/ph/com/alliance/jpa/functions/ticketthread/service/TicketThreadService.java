package ph.com.alliance.jpa.functions.ticketthread.service;

public interface TicketThreadService {
	Object getTicketThread();
	Object findByID(Integer ticketID);
	void updateTicketThread(String ticketID, String thread_content, String created_at, String sent_by, String file_attachment);
}

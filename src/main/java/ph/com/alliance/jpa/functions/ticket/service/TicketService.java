package ph.com.alliance.jpa.functions.ticket.service;

import ph.com.alliance.jpa.entity.Ticket;

public interface TicketService {
	Object getAllTickets();
	
	void createTicket(Ticket ticketmodel);
	
	void updateTicket(Integer ticketID, Ticket ticket);
	
}

package ph.com.alliance.jpa.functions.ticket.service;

import ph.com.alliance.jpa.entity.Ticket;

public interface TicketService {
	Object getAllTickets();
	
	void createTicket(Ticket ticketmodel);
	/**
	 * This is a very awesome documentation
	 * @param TicketModel - model
	 * **/
	void updateTicket(Integer ticketID, Ticket ticket);
	void deleteTicket(Integer ticketID);
	Object findByStatus(String status);
	
}

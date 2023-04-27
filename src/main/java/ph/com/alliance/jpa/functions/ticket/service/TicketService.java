package ph.com.alliance.jpa.functions.ticket.service;

import ph.com.alliance.jpa.entity.Ticket;

public interface TicketService {
	Object getAllTickets();
	Object getAllAgingTickets();
	void createTicket(Ticket ticketmodel);
	/**
	 * This is a very awesome documentation
	 * @param TicketModel - model
	 * **/

	void updateTicket(Integer ticketID, Ticket ticket);
	void deleteTicket(Integer ticketID);
	Object findByStatus(String status);
	//void updateTicketStatus(Integer ticketID, Integer status);
	void updateTicketStatus(Integer ticketID, Ticket ticket);
	void createATicket(Ticket ticket);
	Object findAllTickets(String usertype, Integer id);
	Object findAgingTickets(String usertype, Integer id);
	Object findByEmpEmail();
}

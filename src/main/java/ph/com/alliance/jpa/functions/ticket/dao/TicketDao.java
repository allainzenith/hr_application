package ph.com.alliance.jpa.functions.ticket.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer>{
	
}
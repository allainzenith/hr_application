package ph.com.alliance.jpa.functions.ticket.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer>{
	
	@Query(value="select * from jumpstartprogram2023.ticket where status = :status", nativeQuery = true)
	List<Ticket> findByStatus(@Param(value = "status") String status);
	
//	@Query(value="update jumpstartprogram2023.ticket set status =:status where ticketID = :ticketID", nativeQuery = true)
//	void updateTicketStatus(@Param(value = "ticketID") Integer ticketID, @Param(value = "status") Integer status);
	
	@Query(value="update jumpstartprogram2023.ticket set status =:status where ticketID = :ticketID", nativeQuery = true)
	void updateTicketStatus(@Param(value = "ticketID") Integer ticketID, @Param(value = "status") Integer status, @Param(value = "ticket") Ticket ticket);
}
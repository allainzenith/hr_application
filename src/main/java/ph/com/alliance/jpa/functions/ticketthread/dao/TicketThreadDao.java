package ph.com.alliance.jpa.functions.ticketthread.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.Ticket;
import ph.com.alliance.jpa.entity.TicketThread;

@Repository
public interface TicketThreadDao extends JpaRepository<TicketThread, Integer>{
	
	@Query(value="select * from jumpstartprogram2023.ticket_thread where ticketID = :ticketID", nativeQuery = true)
	List<TicketThread> findByID(@Param(value = "ticketID") Integer ticketID);

	@Modifying
	@Query(value = "INSERT INTO jumpstartprogram2023.ticket_thread (ticketID, thread_content, created_at, sent_by, file_attachment) VALUES (:ticketID, :thread_content, :created_at, :sent_by, :file_attachment)", nativeQuery = true)
	void updateTicketThread(@Param(value="ticketID") String ticketID, @Param(value="thread_content") String thread_content, @Param(value="created_at") String created_at, @Param(value="sent_by") String sent_by, @Param(value="file_attachment") String file_attachment);
}

package ph.com.alliance.jpa.functions.ticket.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ph.com.alliance.jpa.entity.Ticket;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Integer>{
	
	@Query(value="select * from jumpstartprogram2023.ticket where DATEDIFF(CURDATE(), created_at) >= 1", nativeQuery = true)
	List<Ticket> getAllAgingTickets();
	
	@Query(value="select * from jumpstartprogram2023.ticket where status = :status", nativeQuery = true)
	List<Ticket> findByStatus(@Param(value = "status") String status);
	
//	@Query(value="update jumpstartprogram2023.ticket set status =:status where ticketID = :ticketID", nativeQuery = true)
//	void updateTicketStatus(@Param(value = "ticketID") Integer ticketID, @Param(value = "status") Integer status);
	
	@Query(value="update jumpstartprogram2023.ticket set status =:status where ticketID = :ticketID", nativeQuery = true)
	void updateTicketStatus(@Param(value = "ticketID") Integer ticketID, @Param(value = "status") Integer status, @Param(value = "ticket") Ticket ticket);
	
	@Query(value="SELECT * FROM jumpstartprogram2023.ticket t INNER JOIN jumpstartprogram2023.employee e ON t.empId = e.empId WHERE e.email = :email", nativeQuery = true)
	List<Ticket> findByEmpEmail(@Param(value = "email") String email);
	
	@Query(value = "SELECT * FROM jumpstartprogram2023.ticket WHERE :usertype = 'empID' AND empID = :id "
	        + "OR :usertype = 'assigned_to' AND assigned_to = :id", nativeQuery = true)
	List<Ticket> findAllTickets(@Param(value = "usertype") String usertype, @Param(value = "id") Integer id);
	
	@Query(value = "SELECT * FROM jumpstartprogram2023.ticket WHERE DATEDIFF(CURDATE(), created_at) >= 1 AND :usertype = 'empID' AND empID = :id AND status=1 "
	        + "OR DATEDIFF(CURDATE(), created_at) >= 1 AND :usertype = 'assigned_to' AND assigned_to = :id AND status=1", nativeQuery = true)
	List<Ticket> findAgingTickets(@Param(value = "usertype") String usertype, @Param(value = "id") Integer id);

	@Query(value="SELECT * FROM jumpstartprogram2023.ticket where empID = :empID", nativeQuery = true)
	List<Ticket> findByEmpID(@Param(value="empID") Integer empID);

}
package ph.com.alliance.jpa.functions.ticket.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import ph.com.alliance.jpa.entity.Ticket;
import ph.com.alliance.jpa.functions.ticket.dao.TicketDao;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao ticketDao;
	
	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		List<Ticket> tickets = ticketDao.findAll();
		return tickets;
	}
	

	@Override
	public void createTicket(Ticket ticketmodel) {
		Ticket ticket = new Ticket();
		
		try {
			BeanUtils.copyProperties(ticket, ticketmodel);
			ticketDao.saveAndFlush(ticket);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateTicket(Integer ticketId, Ticket ticketmodel) {
		Ticket ticket = new Ticket();
		
		try {
			BeanUtils.copyProperties(ticket, ticketmodel);
			ticket.setTicketID(ticketId);
			ticketDao.saveAndFlush(ticket);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	
	}
	
	
	@Override
	public void deleteTicket(Integer ticketID) {
		ticketDao.deleteById(ticketID);
	}
	
	public List<Ticket> getAllAgingTickets() {
		// TODO Auto-generated method stub
		List<Ticket> tickets = ticketDao.getAllAgingTickets();
		return tickets;
	}
	
	@Override
	public List<Ticket> findByStatus(String status) {
		ticketDao.findByStatus(status);
		
		List<Ticket> tickets = ticketDao.findByStatus(status);
		return tickets;
	}

	
	@Override
	public void updateTicketStatus(Integer ticketId, Integer status, Ticket ticketmodel) {
		Ticket ticket = new Ticket();
		
		try {
			BeanUtils.copyProperties(ticket, ticketmodel);
			ticket.setTicketID(ticketId);
			ticketDao.updateTicketStatus(ticketId, status, ticketmodel);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	
	}
	

	
	@Override
	public List<Ticket> findAllTickets(String usertype, Integer id) {
		
		ticketDao.findAllTickets(usertype, id);
		
		List<Ticket> tickets = ticketDao.findAllTickets(usertype, id);
		
		return tickets;
	}
	
	@Override
	public List<Ticket> findByEmpEmail() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        return ticketDao.findByEmpEmail(email);
	}
	
	@Override
	public List<Ticket> findAgingTickets(String usertype, Integer id) {
		
		ticketDao.findAgingTickets(usertype, id);
		
		List<Ticket> tickets = ticketDao.findAgingTickets(usertype, id);
		
		return tickets;
	}
	
	
	
}

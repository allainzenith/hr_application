package ph.com.alliance.jpa.functions.ticket.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Override
	public List<Ticket> findByStatus(String status) {
		ticketDao.findByStatus(status);
		
		List<Ticket> tickets = ticketDao.findByStatus(status);
		return tickets;
	}
	
//	@Override
//	public void updateTicketStatus(Integer ticketId, Integer status) {
//		Ticket ticket = new Ticket();	
//
//		//BeanUtils.copyProperties(ticket, ticketmodel);
//		ticket.setTicketID(ticketId);
//		ticketDao.updateTicketStatus(ticketId, status);
//	
//	}
	
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
	
}

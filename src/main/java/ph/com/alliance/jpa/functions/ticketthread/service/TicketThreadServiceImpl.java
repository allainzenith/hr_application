package ph.com.alliance.jpa.functions.ticketthread.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ph.com.alliance.jpa.entity.TicketThread;
import ph.com.alliance.jpa.functions.ticketthread.dao.TicketThreadDao;

@Service
public class TicketThreadServiceImpl implements TicketThreadService{
	@Autowired
	TicketThreadDao ticketthreadDao;
	
	@Override
	public List<TicketThread> getTicketThread() {
		// TODO Auto-generated method stub
		List<TicketThread> ticketthread = ticketthreadDao.findAll();
		return ticketthread;
	}
	
	@Override
	public List<TicketThread> findByID(Integer ticketID) {
		
		ticketthreadDao.findByID(ticketID);
		
		List<TicketThread> ticketthread = ticketthreadDao.findByID(ticketID);
		
		return ticketthread;
	}
	
	@Transactional
	@Override
	public void updateTicketThread(String ticketID, String thread_content, String created_at, String sent_by, String file_attachment) {
		ticketthreadDao.updateTicketThread(ticketID, thread_content, created_at, sent_by, file_attachment);
	}
}

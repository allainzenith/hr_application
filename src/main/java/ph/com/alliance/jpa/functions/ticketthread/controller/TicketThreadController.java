package ph.com.alliance.jpa.functions.ticketthread.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.functions.ticketthread.service.TicketThreadService;

@RestController
@RequestMapping("/ticketthread")
public class TicketThreadController {
	
	@Autowired
	TicketThreadService ticketthreadservice;
	
	@GetMapping("/getall")
	public ApiResult getTicketThread() {
		//return "Hello Oslob";
		//return ticketservice.getAllTickets();
		
		return ApiResult.CreateSuccess(ticketthreadservice.getTicketThread(), "Ticket threads retrieved successfully");
	}
	
	@GetMapping("/ticketID/{ticketID}")
	public ApiResult findByID(@PathVariable Integer ticketID) {
		ticketthreadservice.findByID(ticketID);
		
		return ApiResult.CreateSuccess(ticketthreadservice.findByID(ticketID), "Retrieved Successfully");
	}
	
	@PostMapping(value="/updateticketthread", produces="application/json; charset=UTF-8")
	public ApiResult updateTicketThread(@RequestBody Map<String, String> requestBody) {
//		String ticketthreadID = requestBody.get("ticketthreadID");
		String ticketID = requestBody.get("ticketID");
		String thread_content = requestBody.get("thread_content");
		String created_at = requestBody.get("created_at");
		String sent_by = requestBody.get("sent_by");
		String file_attachment = requestBody.get("file_attachment");
//		ticketthreadservice.updateTicketThread(ticketthreadID, ticketID, thread_content, created_at, sent_by, file_attachment);
		ticketthreadservice.updateTicketThread(ticketID, thread_content, created_at, sent_by, file_attachment);
		return ApiResult.CreateSuccess("Updated Successfully");
	}
}

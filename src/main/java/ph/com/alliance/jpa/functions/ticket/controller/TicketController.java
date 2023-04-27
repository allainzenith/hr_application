package ph.com.alliance.jpa.functions.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.entity.Ticket;
import ph.com.alliance.jpa.functions.ticket.service.TicketService;

@RestController
@RequestMapping("/ticket") //sign

public class TicketController {
	
	@Autowired
	TicketService ticketservice;
	
	@GetMapping("/getall")
	public ApiResult getAllTickets() {
		//return "Hello Oslob";
		//return ticketservice.getAllTickets();
		
		return ApiResult.CreateSuccess(ticketservice.getAllTickets(), "Tickets retrieved successfully");
	}
	
	@GetMapping("/getall/aging")
	public ApiResult getAllAgingTickets() {
		//return "Hello Oslob";
		//return ticketservice.getAllTickets();
		
		return ApiResult.CreateSuccess(ticketservice.getAllAgingTickets(), "Tickets retrieved successfully");
	}
	
	@PostMapping("/create")
	public ApiResult createTicket(Ticket ticketmodel) {
		ticketservice.createTicket(ticketmodel);
		return ApiResult.CreateSuccess("Successfully created!");
	}
	

	
	@PutMapping("/update/{ticketID}")
	public ApiResult updateTicket(@PathVariable Integer ticketID, Ticket ticketmodel) {
		ticketservice.updateTicket(ticketID, ticketmodel);
		return ApiResult.CreateSuccess("Successfully updated!");
	}
	
	@PutMapping("/updatestatus/{ticketID}")
	public ApiResult updateTicketStatus(@PathVariable Integer ticketID, Ticket ticketmodel) {
		ticketservice.updateTicketStatus(ticketID, ticketmodel);
		return ApiResult.CreateSuccess("Successfully updated!");
	}
	
	@PostMapping("/createticket")
	public ApiResult createATicket(Ticket ticketmodel) {
		ticketservice.createATicket(ticketmodel);
		return ApiResult.CreateSuccess("Successfully created!");
	}
	
	@DeleteMapping("/delete/{ticketID}")
	public ApiResult deleteTicket(@PathVariable Integer ticketID) {
		ticketservice.deleteTicket(ticketID);
		return ApiResult.CreateSuccess("Successfully deleted!");
	}
	
	@GetMapping("/status/{status}")
	public ApiResult findByStatus(@PathVariable String status) {
		ticketservice.findByStatus(status);
		
		return ApiResult.CreateSuccess(ticketservice.findByStatus(status), "Retrieved Successfully");
	}
	
	@GetMapping("/tickets")
	public ApiResult findByEmpEmail() {
		ticketservice.findByEmpEmail();
		
		return ApiResult.CreateSuccess(ticketservice.findByEmpEmail(), "Retrieved Successfully");
		
	}
	
	@GetMapping("findAllTickets/{usertype}/{id}")
	public ApiResult findAllTickets(@PathVariable String usertype, @PathVariable Integer id){
		ticketservice.findAllTickets(usertype, id);
		
		return ApiResult.CreateSuccess(ticketservice.findAllTickets(usertype, id), "Retrieved Successfully");
	}

	@GetMapping("findAgingTickets/{usertype}/{id}")
	public ApiResult findAgingTickets(@PathVariable String usertype, @PathVariable Integer id){
		ticketservice.findAgingTickets(usertype, id);
		
		return ApiResult.CreateSuccess(ticketservice.findAgingTickets(usertype, id), "Retrieved Successfully");
	}
	

	
	
}

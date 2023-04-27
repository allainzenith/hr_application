package ph.com.alliance.jpa.functions.requestcategory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.alliance.jpa.common.ApiResult;
import ph.com.alliance.jpa.functions.requestcategory.service.RequestCategoryService;

@RestController
@RequestMapping("/requestcategory") //sign

public class RequestCategoryController {
	@Autowired
	RequestCategoryService requestCategoryService;
	
	@GetMapping("/getall")
	public ApiResult getAllCategories() {
		//return "Hello Oslob";
		//return ticketservice.getAllTickets();
		
		return ApiResult.CreateSuccess(requestCategoryService.getAllCategories(), "Categories retrieved successfully");
	}
	
	@GetMapping("/join")
	public ApiResult joinEmployeeandCategory() {
		//return "Hello Oslob";
		//return ticketservice.getAllTickets();
		
		return ApiResult.CreateSuccess(requestCategoryService.joinEmployeeandCategory(), "Categories retrieved successfully");
	}
}

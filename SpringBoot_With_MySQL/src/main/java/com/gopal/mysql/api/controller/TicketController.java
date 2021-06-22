package com.gopal.mysql.api.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.mysql.api.dao.TicketDao;
import com.gopal.mysql.api.model.Ticket;
@CrossOrigin
@RestController
public class TicketController {

	
	
	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody Ticket tickets) {
		dao.save(tickets);
		return "ticket booked : ";
	}

	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) dao.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deletebyId(@PathVariable Integer id){
		 dao.deleteById(id);
		 return "student has been deleted successfully id :"+" "+id;
		
	}
	/**
	 * @Descripition : @PathVariable: here we can pass the param directly for example : http://localhost:9090/getCateory/dhoni
	 * @param catagory
	 * @return
	 */
	@GetMapping("/getCateory/{catagory}")
	public List<Ticket> findByCategory(@PathVariable String catagory){
		return dao.findByCatagory(catagory);
		
	}
	/**
	 * @Description: @PathParam: here we need to pass like queryparam Ex : http://localhost:9090/getCateory/catagory?catagory=yy
	 * @param catagory
	 * @return
	 */
	
//	@GetMapping("/getCateory/{catagory}")
//	public List<Ticket> findByCategory(@PathParam(value = "catagory") String catagory){
//		return dao.findByCatagory(catagory);
//		
//	}
}

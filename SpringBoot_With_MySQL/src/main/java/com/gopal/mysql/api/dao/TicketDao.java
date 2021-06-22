package com.gopal.mysql.api.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gopal.mysql.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{
	public List<Ticket> findByCatagory(String catagory);

}

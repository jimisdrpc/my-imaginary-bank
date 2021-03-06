package com.mybank.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.web.model.Loans;
import com.mybank.web.service.LoansService;

import reactor.core.publisher.Flux;

@RestController
public class LoansController {
	@Autowired
	private LoansService loansService;

	//produces = "application/stream+json")
	//produces = MediaType.APPLICATION_STREAM_JSON_VALUE) 
	//produces = MediaType.APPLICATION_JSON_VALUE)  
	//produces = MediaType.TEXT_EVENT_STREAM_VALUE)

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Flux<Loans> findAll() {
		Flux<Loans> loans = loansService.findAll();
		return loans;
	}
}

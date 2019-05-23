package com.mybank.web.service;

import com.mybank.web.model.*;

import reactor.core.publisher.Flux;

public interface ILoansService {
	
    
	    Flux<Loans> findAll();

	
}

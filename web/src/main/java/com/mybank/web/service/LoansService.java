package com.mybank.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.web.model.Loans;
import com.mybank.web.repository.LoansRepository;

import reactor.core.publisher.Flux;

@Service
public class LoansService implements ILoansService {

	@Autowired
	private LoansRepository loansRepository;
	@Override
	public Flux<Loans> findAll() {

		return loansRepository.findAll();
	}

}

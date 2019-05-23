package com.mybank.kafkacloudstream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.kafkacloudstream.model.Loans;
import com.mybank.kafkacloudstream.repository.LoansRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoansService implements ILoansService{
	@Autowired
	private LoansRepository loansRepository;
	
	@Override
	public void create(Loans l) {

		loansRepository.save(l).subscribe();;
		
	}
}

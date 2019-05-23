package com.mybank.kafkacloudstream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.mybank.kafkacloudstream.model.Loans;
import com.mybank.kafkacloudstream.stream.LoansStreams;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoansListener {
	
	@Autowired
	private LoansService loansService;
	
	@StreamListener(LoansStreams.INPUT)
	public void handleLoans(@Payload Loans l) {
		log.info("Received results: {}", l);
		loansService.create(l);
	}

}
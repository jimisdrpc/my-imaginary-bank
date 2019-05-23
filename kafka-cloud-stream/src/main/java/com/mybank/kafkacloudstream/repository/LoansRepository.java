package com.mybank.kafkacloudstream.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mybank.kafkacloudstream.model.Loans;

public interface LoansRepository extends ReactiveMongoRepository<Loans, Integer>{

}

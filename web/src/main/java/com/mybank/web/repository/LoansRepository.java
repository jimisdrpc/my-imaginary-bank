package com.mybank.web.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.mybank.web.model.Loans;

public interface LoansRepository extends ReactiveMongoRepository<Loans, Integer>{

}


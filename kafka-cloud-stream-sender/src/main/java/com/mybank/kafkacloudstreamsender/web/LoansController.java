package com.mybank.kafkacloudstreamsender.web;

import com.mybank.kafkacloudstreamsender.model.Loans;
import com.mybank.kafkacloudstreamsender.service.LoansService;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoansController {

    private final LoansService loansService;
    public LoansController(LoansService loansService) {
        this.loansService = loansService;
    }

    @GetMapping("/loans")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void loans(@RequestParam("result") String result) {
        Loans loans = Loans.builder().result
            (result)
            .timestamp(System.currentTimeMillis())
            .build();
        loansService.sendLoan(loans);
    }
}

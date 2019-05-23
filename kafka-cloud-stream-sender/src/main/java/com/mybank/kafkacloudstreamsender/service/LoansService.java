package com.mybank.kafkacloudstreamsender.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.mybank.kafkacloudstreamsender.model.Loans;
import com.mybank.kafkacloudstreamsender.stream.LoansStreams;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoansService {
    private final LoansStreams loansStreams;
    public LoansService(LoansStreams loansStreams) {
        this.loansStreams = loansStreams;
    }
    public void sendLoan(final Loans loans) {
        log.info("Sending loans {}", loans);
        MessageChannel messageChannel = loansStreams.outboundLoans();
        messageChannel.send(MessageBuilder
                .withPayload(loans)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}

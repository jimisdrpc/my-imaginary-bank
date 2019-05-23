package com.mybank.kafkacloudstreamsender.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface LoansStreams {

	String OUTPUT = "loans-out";

	@Output(OUTPUT)
	MessageChannel outboundLoans();

}

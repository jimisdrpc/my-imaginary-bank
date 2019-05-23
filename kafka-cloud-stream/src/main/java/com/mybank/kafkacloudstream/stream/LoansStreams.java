package com.mybank.kafkacloudstream.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface LoansStreams {

	String INPUT = "loans-in";

	@Input(INPUT)
	SubscribableChannel inboundLoans();



}

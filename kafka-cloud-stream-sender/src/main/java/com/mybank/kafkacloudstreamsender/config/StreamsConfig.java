package com.mybank.kafkacloudstreamsender.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.mybank.kafkacloudstreamsender.stream.LoansStreams;

@EnableBinding(LoansStreams.class)
public class StreamsConfig {

}

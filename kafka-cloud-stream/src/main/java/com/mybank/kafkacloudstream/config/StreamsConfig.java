package com.mybank.kafkacloudstream.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.mybank.kafkacloudstream.stream.LoansStreams;

@EnableBinding(LoansStreams.class)
public class StreamsConfig {

}

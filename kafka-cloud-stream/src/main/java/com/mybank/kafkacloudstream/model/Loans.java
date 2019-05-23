package com.mybank.kafkacloudstream.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @Getter @Setter @ToString 
public class Loans {

	private long timestamp;
	private String result;
}

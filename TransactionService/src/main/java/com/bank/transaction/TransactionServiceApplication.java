package com.bank.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.bank.transaction.controller","com.bank.transaction.repository","com.bank.transaction.configuration","com.bank.transaction.service","com.bank.transaction.entity","com.bank.transaction.DTO"})
public class TransactionServiceApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
	}

}
 
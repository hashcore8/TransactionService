package com.bank.transaction.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.transaction.DTO.DTOConversion;
import com.bank.transaction.DTO.TransactionDTO;
import com.bank.transaction.entity.Transaction;
import com.bank.transaction.service.TransactionServiceI;

@Controller
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionServiceI transactionservice;
	
	@Autowired
	DTOConversion dtoconversion;
	
	
	

	@GetMapping(value = "/welcomceTransaction")
	public String transactionservice() {
		return "Welcome to transaction service";
	}

	@GetMapping(value = "/Transactionpage")
	public String pagetransaction(Model model ) {
		
		model.addAttribute("transactionpojo", new TransactionDTO());
		
		return "performTransaction";
	}

	
	@PostMapping(value = "/makeTransaction")
	public String maketransaction(@Valid  @ModelAttribute("transactionpojo") TransactionDTO pojo,BindingResult result) {
		
		
		 if (result.hasErrors()) {
			 System.out.println("error occurred");

		return "performTransaction";
		 }
		 else {
				System.out.println("MAked transaction");
				
			
					// DTo is must modelmapper is pending
					
					
					Transaction obj = new Transaction(pojo.getFrom_Account(), pojo.getTo_Account(), pojo.getAmount(),new Date(),
							"Credit");
					
					transactionservice.createTransaction(obj); 
			
				
				
				
		 }
		 return "success";
		 
		
		
	}

	@PostMapping(value = "/searchTransaction")
	public String searchTransaction() {
		System.out.println("MAked transaction");
		Transaction obj = null;
		transactionservice.createTransaction(obj);

		return "performTransaction";
	}

}

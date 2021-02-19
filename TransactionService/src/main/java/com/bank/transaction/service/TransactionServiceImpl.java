package com.bank.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.transaction.DTO.DTOConversion;
import com.bank.transaction.entity.Transaction;
import com.bank.transaction.repository.TransactionRepository;


@Service
public class TransactionServiceImpl implements TransactionServiceI {
	
	@Autowired
	TransactionRepository repo;
	
	
	
	@Transactional
	@Override
	public boolean createTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		
		//Transaction obj =new Transaction(101, 102, 100,new java.util.Date() ,"Credit");
		
		repo.save(transaction);
		return true;
	}

	@Override
	public boolean updateTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean FindTransaction() {
		// TODO Auto-generated method stub
		return false;
	}

}

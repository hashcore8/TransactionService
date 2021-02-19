package com.bank.transaction.service;

import com.bank.transaction.entity.Transaction;

public interface TransactionServiceI {
	
	
	boolean createTransaction(Transaction transaction);
	
	boolean updateTransaction(Transaction transaction);
	
	boolean FindTransaction();
	
	
	
	

}

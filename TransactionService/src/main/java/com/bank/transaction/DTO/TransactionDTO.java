package com.bank.transaction.DTO;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class TransactionDTO {
	
	@NotNull(message = "Please enter a valid from_Account address")
	@Range(min=1000, max=10000000)
	private int from_Account;

	@NotNull(message = "Please enter a valid to_Account address")
	@Range(min=1000, max=10000000)
	private int to_Account;
	
	@NotNull(message = "Please enter a valid amount address")
	@Range(min=1000, max=10000000)
	private int amount;
	
	@NotNull(message = "Please enter a valid transaction_type address")
	@Length(min=5, max=15,message = "Please enter a valid transaction_type address")
	private String transaction_type;

	public int getFrom_Account() {
		return from_Account;
	}

	public void setFrom_Account(int from_Account) {
		this.from_Account = from_Account;
	}

	public int getTo_Account() {
		return to_Account;
	}

	public void setTo_Account(int to_Account) {
		this.to_Account = to_Account;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	@Override
	public String toString() {
		return "TransactionDTO [from_Account=" + from_Account + ", to_Account=" + to_Account + ", amount=" + amount
				+ ", transaction_type=" + transaction_type + "]";
	}
	
	
	
	
	

}

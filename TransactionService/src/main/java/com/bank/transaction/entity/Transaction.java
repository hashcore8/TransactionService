package com.bank.transaction.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_id")
	private long transaction_id;
	
	
	@Column(name="from_Account")
	private int from_Account; 
	@Column(name="to_Account")
	private int to_Account;
	@Column(name="amount")
	private int amount;
	@Column(name="transaction_timestamp")
	private Date transaction_timestamp;
	@Column(name="transaction_type")
	private String transaction_type;
	
	
	public Transaction(int from_Account, int to_Account, int amount, Date transaction_timestamp,
			String transaction_type) {
		super();
		this.from_Account = from_Account;
		this.to_Account = to_Account;
		this.amount = amount;
		this.transaction_timestamp = transaction_timestamp;
		this.transaction_type = transaction_type;
	}
	
	public Transaction()
	{
		
	}
	
	
	public long getTransaction_id() {
		return transaction_id;
	}






	public int getFrom_Account() {
		return from_Account;
	}
	public int getTo_Account() {
		return to_Account;
	}
	public int getAmount() {
		return amount;
	}
	public Date getTransaction_timestamp() {
		return transaction_timestamp;
	}
	public String getTransaction_type() {
		return transaction_type;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", from_Account=" + from_Account + ", to_Account="
				+ to_Account + ", amount=" + amount + ", transaction_timestamp=" + transaction_timestamp
				+ ", transaction_type=" + transaction_type + "]";
	}

	
	
	
	
	
	
	
	
	
}
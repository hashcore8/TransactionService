package com.bank.transaction.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.transaction.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}

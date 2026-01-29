package com.money.manager.repository;

import com.money.manager.model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findAllByTransactionDateBetweenOrderByTransactionDateDesc(LocalDateTime start, LocalDateTime end);
}

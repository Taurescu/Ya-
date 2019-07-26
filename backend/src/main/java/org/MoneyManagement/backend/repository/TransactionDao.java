package org.MoneyManagement.backend.repository;

import org.MoneyManagement.backend.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionDao extends CrudRepository<Transaction, Long> {
}

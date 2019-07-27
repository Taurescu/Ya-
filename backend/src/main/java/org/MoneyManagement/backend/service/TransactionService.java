package org.MoneyManagement.backend.service;

import org.MoneyManagement.backend.entity.TransactionType;
import org.MoneyManagement.backend.entity.User;

import java.util.List;

public interface TransactionService {

    List<TransactionType> findByUser(User user);

    TransactionType createTransactionType(TransactionType transactionType);
}

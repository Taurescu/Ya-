package org.MoneyManagement.backend.service.impl;

import org.MoneyManagement.backend.entity.TransactionType;
import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.repository.TransactionDao;
import org.MoneyManagement.backend.repository.TransactionTypeDao;
import org.MoneyManagement.backend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionDao transactionDao;

    @Autowired
    private TransactionTypeDao transactionTypeDao;


    @Override
    public List<TransactionType> findByUser(User user) {
        return transactionTypeDao.findByUser(user);
    }
}

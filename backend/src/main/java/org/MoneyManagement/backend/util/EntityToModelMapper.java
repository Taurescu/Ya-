package org.MoneyManagement.backend.util;

import org.MoneyManagement.backend.controller.model.GeneralTransactionTypeRequest;
import org.MoneyManagement.backend.entity.TransactionType;
import org.MoneyManagement.backend.entity.User;

public class EntityToModelMapper {

    public static TransactionType generalTransactionTypeRequestToTransactionType(GeneralTransactionTypeRequest generalTransactionTypeRequest, User user) {
        TransactionType transactionType = new TransactionType();
        transactionType.setId(generalTransactionTypeRequest.getId());
        transactionType.setName(generalTransactionTypeRequest.getName());
        transactionType.setCreatedAt(generalTransactionTypeRequest.getCreatedAt());
        transactionType.setUser(user);
        return transactionType;
    }
}

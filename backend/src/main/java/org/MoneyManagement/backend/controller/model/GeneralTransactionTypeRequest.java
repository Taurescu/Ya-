package org.MoneyManagement.backend.controller.model;

import org.MoneyManagement.backend.entity.Transaction;

import java.util.Date;
import java.util.List;

public class GeneralTransactionTypeRequest {

    private String id;

    private String name;

    private String userId;

    private List<Transaction> transactions;

    private Date createdAt;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

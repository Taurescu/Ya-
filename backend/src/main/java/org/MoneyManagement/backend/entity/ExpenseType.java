package org.MoneyManagement.backend.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class ExpenseType {

    @Id
    private String id;

    private String type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String name;

    private Float defaultAmount;

    private Date createdAt;

    @OneToMany(mappedBy = "expenseType", cascade = CascadeType.ALL)
    private List<IncomeDistribution> budget;

    @OneToMany(mappedBy = "expenseType", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDefaultAmount() {
        return this.defaultAmount;
    }

    public void setDefaultAmount(Float defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<IncomeDistribution> getBudget() {
        return this.budget;
    }

    public void setBudget(List<IncomeDistribution> budget) {
        this.budget = budget;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}

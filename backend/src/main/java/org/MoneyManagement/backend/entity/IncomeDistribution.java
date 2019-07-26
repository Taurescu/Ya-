package org.MoneyManagement.backend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "income_distribution")
public class IncomeDistribution {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "expense_type_id", nullable = false)
    private ExpenseType expenseType;

    private Float actualAmount;

    private Date createdAt;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExpenseType getExpenseType() {
        return this.expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public Float getActualAmount() {
        return this.actualAmount;
    }

    public void setActualAmount(Float actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

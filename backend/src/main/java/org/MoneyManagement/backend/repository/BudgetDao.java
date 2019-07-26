package org.MoneyManagement.backend.repository;

import org.MoneyManagement.backend.entity.IncomeDistribution;
import org.springframework.data.repository.CrudRepository;

public interface BudgetDao extends CrudRepository<IncomeDistribution, Long> {
}

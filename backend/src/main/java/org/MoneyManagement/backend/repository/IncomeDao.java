package org.MoneyManagement.backend.repository;

import org.MoneyManagement.backend.entity.Income;
import org.springframework.data.repository.CrudRepository;

public interface IncomeDao extends CrudRepository<Income, Long> {
}

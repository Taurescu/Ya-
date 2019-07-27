package org.MoneyManagement.backend.repository;

import org.MoneyManagement.backend.entity.TransactionType;
import org.MoneyManagement.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionTypeDao extends CrudRepository<TransactionType, String> {

    List<TransactionType> findByUser(@Param("user") User user);
}

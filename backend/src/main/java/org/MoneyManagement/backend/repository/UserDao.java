package org.MoneyManagement.backend.repository;

import org.MoneyManagement.backend.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
}


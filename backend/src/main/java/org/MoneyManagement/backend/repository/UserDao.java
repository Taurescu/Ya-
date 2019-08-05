package org.MoneyManagement.backend.repository;

import org.MoneyManagement.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends CrudRepository<User, String> {
    User findByName(@Param("name")String name);
}


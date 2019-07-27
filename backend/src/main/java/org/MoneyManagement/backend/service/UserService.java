package org.MoneyManagement.backend.service;

import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.model.GeneralUserRequest;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User addUser(GeneralUserRequest request);

    void removeUserById(String id);

    User editUser(GeneralUserRequest request);

    User getUserbyId(String id);

    User getUserbyName(String name);

}

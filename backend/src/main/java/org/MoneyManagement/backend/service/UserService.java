package org.MoneyManagement.backend.service;

import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.model.UserDTO;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(GeneralUserRequest request);

    void removeUserById(String id);

    void editUser(GeneralUserRequest request);

    User getUserbyId(String id);

    User getUserbyName(String name);

}

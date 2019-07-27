package org.MoneyManagement.backend.service.impl;

import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.model.GeneralUserRequest;
import org.MoneyManagement.backend.repository.UserDao;
import org.MoneyManagement.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    enum requestType {ChangeName, ChangePassword, ChangeUserName, UndefinedRequest}

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {

        return (List<User>) userDao.findAll();
    }

    @Override
    public User addUser(GeneralUserRequest request) {

        User tempUser = new User();
        User tempSavedUser = new User();

        if (request != null) {
            tempUser.setName(request.getName());
            tempUser.setPassword(request.getPassword());
            tempUser.setCreatedAt(new Date());
            tempUser.setUserName(request.getUserName());
            tempSavedUser = userDao.save(tempUser);

            if (tempUser.equalsNew(tempSavedUser)) {
                /*Nothing to do, user saved correctyl*/
            } else {
                /*ERROR, user not saved correctly*/
            }

        } else {
            /*AleTau: Handle null request*/
        }
        return tempSavedUser;
    }

    @Override
    public void removeUserById(String id) {
        if (id != null) {
            userDao.deleteById(id);
        } else {
            /*AleTau: Handle id = null exception*/
        }
    }

    @Override
    public User editUser(GeneralUserRequest request) {
        User tempUser = new User();
        User tempUpdatedUser = new User();
        String userId = request.getId();

        if (userId != null) {
            tempUser = userDao.findById(userId).orElse(null);
            if (tempUser != null) {
                tempUser.setName(request.getName());
                tempUser.setPassword(request.getPassword());
                tempUser.setUserName(request.getUserName());

                tempUpdatedUser = userDao.save(tempUser);

                if (tempUser.equalsNew(tempUpdatedUser) == true) {
                    /*User saved correctly, Nothing to do*/
                } else {
                    /*Handle user not saved correctly*/
                }
            }
        } else {
            /*AleTau: Handle id = null exception*/
        }
        return tempUpdatedUser;
    }

    @Override
    public User getUserById(String id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }
}

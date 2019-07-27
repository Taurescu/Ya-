package org.MoneyManagement.backend.service.impl;

import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.repository.UserDao;
import org.MoneyManagement.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {

        return (List<User>) userDao.findAll();
    }

    @Override
    public void addUser(GeneralUserRequest request) {
        User tempUser = new User();
        tempUser.setId(request.getId());
        tempUser.setName(request.getName());
        tempUser.setPassword(request.getPassword());
        tempUser.setCreatedAt(new Date());
        tempUser.setUserName(request.getUserName());
        if(tempUser.getId() != null)
        {
            userDao.save(tempUser);
        }
    }

    @Override
    public void removeUserById(String id)
    {
        userDao.deleteById(id);
    }

    @Override
    public void editUser(GeneralUserRequest request) {

    }

    @Override
    public User getUserbyId(String id) {
        return null;
    }

    @Override
    public User getUserbyName(String name) {
        return null;
    }
}

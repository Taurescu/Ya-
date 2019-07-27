package org.MoneyManagement.backend.controller;

import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.controller.model.GeneralUserRequest;
import org.MoneyManagement.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody User addUser(@RequestBody GeneralUserRequest generalUserRequest)
    {
        User savedUser = userService.addUser(generalUserRequest);

        return savedUser;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers()
    {
     return userService.getAllUsers();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void removeUserById(@PathVariable String id)
    {
        userService.removeUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody User editUser(@RequestBody GeneralUserRequest generalUserRequest)
    {
        return userService.editUser(generalUserRequest);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public @ResponseBody User getUsebById(@PathVariable String id)
    {
        return userService.getUserById(id);
    }
}

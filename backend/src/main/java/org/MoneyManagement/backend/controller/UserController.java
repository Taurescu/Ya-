package org.MoneyManagement.backend.controller;

import org.MoneyManagement.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
}

package org.MoneyManagement.backend.controller;

import org.MoneyManagement.backend.entity.TransactionType;
import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.service.TransactionService;
import org.MoneyManagement.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/transactionTypesForUser/{id}", method = RequestMethod.GET)
    public @ResponseBody List<TransactionType> getTransactionTypesForUser(@PathVariable String id) {
        User user = userService.getUserById(id);
        return transactionService.findByUser(user);
    }
}

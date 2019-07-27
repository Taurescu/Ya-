package org.MoneyManagement.backend.controller;

import org.MoneyManagement.backend.controller.model.GeneralTransactionTypeRequest;
import org.MoneyManagement.backend.entity.TransactionType;
import org.MoneyManagement.backend.entity.User;
import org.MoneyManagement.backend.service.TransactionService;
import org.MoneyManagement.backend.service.UserService;
import org.MoneyManagement.backend.util.EntityToModelMapper;
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

    @RequestMapping(path = "/types/user/{id}", method = RequestMethod.GET)
    public @ResponseBody List<TransactionType> getTransactionTypesForUser(@RequestHeader String id) {
        User user = userService.getUserById(id);
        return transactionService.findByUser(user);
    }

    @RequestMapping(path = "/types", method = RequestMethod.POST)
    public @ResponseBody TransactionType createTransactionType(@RequestBody GeneralTransactionTypeRequest generalTransactionTypeRequest) {
        User user = userService.getUserById(generalTransactionTypeRequest.getId());
        return transactionService.createTransactionType(EntityToModelMapper.generalTransactionTypeRequestToTransactionType(generalTransactionTypeRequest, user));
    }
}

package com.boggybumblebee.bankingapiinviolable.web;

import com.boggybumblebee.bankingapiinviolable.entity.Transaction;
import com.boggybumblebee.bankingapiinviolable.service.TransactionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController@RequestMapping("/api/v1/transactions")
public class TransactionController {

    TransactionService transactionService;

    public TransactionController(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}

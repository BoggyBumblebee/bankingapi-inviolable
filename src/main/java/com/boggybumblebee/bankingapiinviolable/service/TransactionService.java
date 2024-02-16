package com.boggybumblebee.bankingapiinviolable.service;

import com.boggybumblebee.bankingapiinviolable.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        return null;
    }
}

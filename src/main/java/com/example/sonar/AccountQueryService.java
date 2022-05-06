package com.example.sonar;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountQueryService {

    @Autowired
    private AccountRepository accountRepository;

    public Optional<Account> getAccountById(Long accountId) {
        return  accountRepository.findById(accountId);
    }

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }
}

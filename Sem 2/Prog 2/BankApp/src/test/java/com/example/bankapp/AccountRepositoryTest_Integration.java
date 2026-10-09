package com.example.bankapp;

import com.example.bankapp.model.Account;
import com.example.bankapp.repository.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AccountRepositoryTest_Integration {

    @Autowired
    AccountRepository accountRepository;

    @Test
    @DisplayName("getAccountByNumberTest()")
    public void getAccountByNumberTest(){
        // Assumptions
        int number = 1;
        // Execution
        Account account = accountRepository.getAccountByNumber(number);
        // Validation
        assertNotNull(account, "account not found");
        assertEquals("Mateusz", account.getAccountName());
    }

}

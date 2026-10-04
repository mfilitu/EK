package com.example.bankapp.controller;

import com.example.bankapp.model.Account;
import com.example.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/getCreateAccount")
    public String createAccount() {
        return "createAccount";
    }

    @PostMapping("/saveCreateAccount")
    public String postCreateAccount(
            @RequestParam("accountNumber") int accountNumber,
            @RequestParam("accountName") String accountName,
            @RequestParam("balance") double balance) {

        Account account = new Account(accountNumber, accountName, balance);
        accountRepository.save(account);
        return "redirect:/";
    }

    @PostMapping("/deleteAccount")
    public String deleteAccount(@RequestParam("accountNumber") int accountNumber) {

        accountRepository.deleteAccount(accountNumber);

        return "redirect:/";
    }

    @GetMapping("/showAccount")
    public String showAccount(@RequestParam("accountNumber") int accountNumber, Model model) {

        Account account = accountRepository.getAccountByNumber(accountNumber);
        model.addAttribute(account);

        return "showAccount";
    }

    @PostMapping("/deposit")
    public String deposit(
            @RequestParam("accountNumber") int accountNumber,
            @RequestParam("amount") double amount) {

        Account account =
                accountRepository.getAccountByNumber(accountNumber);

        double newBalance =
                account.getBalance() + amount;

        accountRepository.updateBalance(
                accountNumber,
                newBalance
        );

        return "redirect:/showAccount?accountNumber=" + accountNumber;
    }

    @PostMapping("/withdraw")
    public String withdraw(
            @RequestParam("accountNumber") int accountNumber,
            @RequestParam("amount") double amount) {

        Account account =
                accountRepository.getAccountByNumber(accountNumber);

        double newBalance =
                account.getBalance() - amount;

        accountRepository.updateBalance(
                accountNumber,
                newBalance
        );

        return "redirect:/showAccount?accountNumber=" + accountNumber;
    }

    @PostMapping("/transfer")
    public String transfer(@RequestParam("currentAccountNumber") int currentAccountNumber,
            @RequestParam("accountNumber") int accountNumber,
            @RequestParam("amount") double amount) {

        Account account1 =
                accountRepository.getAccountByNumber(currentAccountNumber);

        Account account2 =
                accountRepository.getAccountByNumber(accountNumber);

        double from =
                account1.getBalance() - amount;
        double to =
                account2.getBalance() + amount;

        accountRepository.updateBalance(
                currentAccountNumber,
                from
        );
        accountRepository.updateBalance(
                accountNumber,
                to
        );

        return "redirect:/showAccount?accountNumber=" + currentAccountNumber;
    }

}

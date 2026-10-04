package com.example.bankapp.controller;

import com.example.bankapp.model.Account;
import com.example.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PageController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/")
    public String mainPage(Model model){
        ArrayList<Account> accountList = new ArrayList<>();

        accountList = accountRepository.getAllAccounts();

        model.addAttribute("accountList", accountList);

        return "index";
    }
}

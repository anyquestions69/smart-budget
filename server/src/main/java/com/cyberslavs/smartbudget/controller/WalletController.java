package com.cyberslavs.smartbudget.controller;

import com.cyberslavs.smartbudget.model.Transaction;
import com.cyberslavs.smartbudget.model.Wallet;
import com.cyberslavs.smartbudget.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    WalletRepository walletRepository;
    @GetMapping
    List<Wallet> findAll(){
        return walletRepository.findAll();
    }
    @GetMapping("/{email}")
    Wallet findOne(@PathVariable String email){
        return walletRepository.findByEmail(email);
    }

    @PostMapping("/register")
    Wallet register(@RequestBody Wallet user){
        Wallet newUser  = walletRepository.save(user);
        System.out.println(newUser.getBalance());
        return newUser;
    }

}

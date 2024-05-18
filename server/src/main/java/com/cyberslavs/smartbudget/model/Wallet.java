package com.cyberslavs.smartbudget.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.List;

@Entity
@DynamicUpdate
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String email;
    private String password;
    @Column(columnDefinition = "double precision default 0.0")
    private Double balance=0.0;
    protected Wallet(){}
    public Wallet(String email, String password){
        this.email=email;
        this.password=password;
        this.balance=0.0;
    }
    @OneToMany(targetEntity=Transaction.class)
    private List transactions;
    public String getEmail() {
        return email;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setTransactions(List transactions) {
        this.transactions = transactions;
    }
}

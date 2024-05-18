package com.cyberslavs.smartbudget.DTO;

import java.time.LocalDate;

public class TransactionDTO {
    public String name;
    public Double price;
    public Long walletId;
    public Long categoryId;
    public LocalDate date;
    public TransactionDTO(String name, Double price, Long walletId, Long categoryId, LocalDate date){
        this.name=name;
        this.price=price;
        this.walletId=walletId;
        this.categoryId=categoryId;
        this.date=date;
    }
}

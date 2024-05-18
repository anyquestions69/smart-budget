package com.cyberslavs.smartbudget.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Float price;
    private LocalDate date;
    public Transaction(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

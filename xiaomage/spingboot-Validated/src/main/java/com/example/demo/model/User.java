package com.example.demo.model;

import com.example.demo.validation.constraints.CardNumberVa;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class User {

    @Max(value = 100)
    private long id;
    @NotNull
    private String name;
    @CardNumberVa
    private String cardNumber;//必须以zzq 开头kuai ?


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

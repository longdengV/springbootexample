package com.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

    @Autowired
    private IDCard idCard;

    public User() {
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}

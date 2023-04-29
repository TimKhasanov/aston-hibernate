package com.example.HibernateProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BankCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int cardNumber;
    private int pinCode;
    @ManyToOne
    private User users;

    public BankCard() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}

package com.example.user.lipatransyapp;


import android.widget.Toast;

public class Account {
    private int phone_number;
    private int password = 2018;

    private int deposit;
    private int payment;
    private int balance = 500;

    public Account(){
    }

    // Methods
    // Get Balance
    public int getBalance(){
        return this.balance;
    }
    public int getPayment(){
        return this.payment;
    }
    public int getPhoneNumber(){
        return this.phone_number;
    }
    public int getPassword(){
        return this.password;
    }

    // Set payment
    private void setPhoneNumber(int phone_number){
        this.phone_number = phone_number;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public void setPayment(int payment){
        this.payment = payment;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}

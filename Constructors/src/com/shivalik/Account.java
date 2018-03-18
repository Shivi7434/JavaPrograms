package com.shivalik;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account(){

        this("56789",200.0, "Default customerName");
        System.out.println("Empty constructor called"); //creating a constructor
    }
    public Account(String number, double balance, String customerName){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public Account(String customerName, String customerEmail, String phoneNumber) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public void withdrawal (double withdrawalAmount) {
        if (balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " has been processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package com.shivalik;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();//"123456", 0.00, "Bob Brown"); //passing value of constructor created

        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getNumber());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account ShivisAccount = new Account( 250,"12345678")
    }
}

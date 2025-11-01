package model;

import constant.Constant;

/*
Instance new Person() được lưu ở bộ nhớ Heap;
Biến tham chiếu được lưu vào bộ nhớ Stack và trỏ đến địa chỉ của Instance new Person() ở Heap
*/

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private double balance;

//    public User(String name, String id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public User(String id, String name, double balance) {
//        this.id = id;
//        this.name = name;
//        this.balance = balance;
//    }

    public User(String name, double balance) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double amount) {
        if (Constant.Account.isAccountLocked){
            System.out.println(Constant.ErrorMessage.INVALID_ACCOUNT_LOCKED);
            return;
        }
        if (amount > Constant.Account.isAccountDepositLimit){
            System.out.println(Constant.ErrorMessage.INVALID_ACCOUNT_DEPOSIT);
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {

        /*
        1. 0 < Amount < Balance
        2. Amount Draw Limit
        3. Account locked
        * */
        return;
    }
}

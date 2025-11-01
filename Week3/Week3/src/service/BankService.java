package service;
import constant.Constant;
import model.User;
public class BankService {
    public void transfer(User from, User to, double amount) {
        /*
        1. Ngan hang bao tri
        2. Tai khoan khong ton tai
        3.
         */

        if (Constant.Bank.isBankMaintain) {
            System.out.println();
        }
    }
}

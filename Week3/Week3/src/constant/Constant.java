package constant;

public class Constant {
    public static class Account {
        public static boolean isAccountLocked = false;
        public static double isAccountDepositLimit = 10000000.0;
        public static double isAccountWithDrawLimit = 10000000.0;
    }

    public static class Bank {
        public static boolean isBankMaintain = true;
    }

    public static class ErrorMessage {
        public static String INVALID_AMOUNT = "invalid amount";
        public static String INVALID_ACCOUNT_LOCKED = "account locked";
        public static String INVALID_ACCOUNT_WITHDRAW = "account withdraw failed";
        public static String INVALID_ACCOUNT_DEPOSIT = "account deposit failed";
        public static String BANK_MAINTAIN = "bank maintain";
    }
}

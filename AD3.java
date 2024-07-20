class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private int accountNumber;
    private double balance;

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }
}

public class AD3 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.depositAmount(1000);
        try {
            account.withdrawAmount(500);
            account.withdrawAmount(700);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

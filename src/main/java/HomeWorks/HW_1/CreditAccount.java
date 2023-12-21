package HomeWorks.HW_1;

public class CreditAccount extends Account {
    private static final double COMMISSION_RATE = 0.01;

    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    public void takeAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        }
        if (amount > getAmount()) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal.");
        }
        double withdrawalAmountWithCommission = amount + amount * COMMISSION_RATE;
        if (withdrawalAmountWithCommission > getAmount()) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal with commission.");
        }
        super.takeAmount(withdrawalAmountWithCommission);
    }
}

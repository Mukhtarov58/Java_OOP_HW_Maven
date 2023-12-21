package HomeWorks.HW_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {
    private LocalDate lastDepositDate;

    public DepositAccount(double initialBalance) {
        super(initialBalance);
        this.lastDepositDate = LocalDate.now();
    }

    public void putAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0.");
        }
        super.putAmount(amount);
        this.lastDepositDate = LocalDate.now();
    }

    public void takeAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        }
        if (amount > getAmount()) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal.");
        }

        LocalDate currentDate = LocalDate.now();
        long monthsBetweenLastDepositAndCurrentDate = ChronoUnit.MONTHS.between(lastDepositDate, currentDate);

        if (monthsBetweenLastDepositAndCurrentDate < 1) {
            throw new IllegalArgumentException("Cannot withdraw funds within 1 month of the last deposit.");
        }

        super.takeAmount(amount);
    }
}

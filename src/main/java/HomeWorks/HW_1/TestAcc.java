package HomeWorks.HW_1;

/**
 * Необходимо создать класс Account, описывающий банковский счет.
 * Он должен иметь 3 метода: пополнение(putAmount) и снятие(takeAmount) средств и отображение(getAmount) текущего баланса (геттер).
 * Первые два меняют баланс, последний просто возвращает его.
 * <p>
 * Далее, необходимо создать наследника - CreditAccount, описывающий кредитный счет.
 * Снятие средств с этого кредитного счета облагается комиссией в размере 1% от суммы снятия.
 * <p>
 * Далее, необходимо создать наследника - DepositAccount, описывающий депозитный счет.
 * Его особенность в том, что нельзя снимать средства в течение 1 месяца после пополнения.
 */


public class TestAcc {
    public static void main(String[] args) {
        Account account = new Account(1000);
        System.out.println(account.getAmount());
        account.putAmount(500);
        System.out.println(account.getAmount());
        account.takeAmount(333);
        System.out.println(account.getAmount());
        CreditAccount creditAccount = new CreditAccount(5000);
        creditAccount.takeAmount(100);
        System.out.println(creditAccount.getAmount());
        creditAccount.putAmount(500);
        System.out.println(creditAccount.getAmount());
        DepositAccount depositAccount = new DepositAccount(100);
//        depositAccount.takeAmount(20);
        System.out.println(depositAccount.getAmount());
    }
}

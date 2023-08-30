
public class Main {
    public static void main(String[] args) {

        int AccountBalance = 100; // баланс счета
        int DepositAmount = 1100; // сумма пополнения
        int BonusMoney = DepositAmount / 100; // бонусные рубли
        int AccountBalanceAfterReplenishment;
        if (DepositAmount > 1000) {
            AccountBalanceAfterReplenishment = (AccountBalance + DepositAmount + BonusMoney);
        } else {
            AccountBalanceAfterReplenishment = (AccountBalance + DepositAmount);
        }
        ;
        System.out.println("Итого на балансе: " + AccountBalanceAfterReplenishment + " рублей.");
    }
}

public class Main {
    public static void main(String[] args) {

        int accountBalance = 100; // баланс счета
        int depositAmount = 1100; // сумма пополнения
        int bonusMoney = depositAmount / 100; // бонусные рубли
        int accountBalanceAfterReplenishment;
        if (depositAmount > 1000) {
            accountBalanceAfterReplenishment = (accountBalance + depositAmount + bonusMoney);
        } else {
            accountBalanceAfterReplenishment = (accountBalance + depositAmount);
        }
        ;
        System.out.println("Итого на балансе: " + accountBalanceAfterReplenishment + " рублей.");
    }
}
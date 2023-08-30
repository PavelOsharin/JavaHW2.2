
public class Main {
    public static void main(String[] args) {

        int x = 100; // баланс счета
        int y = 1100; // сумма пополнения
        int z = y / 100; // бонусные рубли
        int summ;
        if (y > 1000) {
            summ = (x + y + z);
        } else {
            summ = (x + y);
        }
        ;
        System.out.println("Итого на балансе: " + summ + " рублей.");
    }
}
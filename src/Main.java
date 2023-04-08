public class Main {
    public static void main(String[] args) {

        int check = 100;
        int payment = 1100;
        int bonus = payment / 100;

        if (payment > 1000) {
            bonus = (payment) / 100;

        } else {
            bonus = 0;

        }
        System.out.println(bonus + "бонус");
        System.out.println(check + payment + bonus + "сумма");

    }
}
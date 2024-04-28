package homework;
/*
Задача 3. В первый день спортсмен пробежал s километров,
а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
Определите номер того дня, на который пробег спортсмена составит не менее
target километров. Программа получает на вход действительные числа s и target
 и должна вывести одно натуральное число.
 */
public class athleteResult {
    public static void main(String[] args) {
        double s = 10;
        double target = 20;
        int days = calculateDays(s, target);
        System.out.println("The athlete will reach the goal by " + days + " day ");
    }
    private static int calculateDays(double s, double target) {

        int days = 1;
        double currentDistance = s;
        while (currentDistance < target) {
            currentDistance *= 1.1;
            days++;
        }
        return days;
    }
}
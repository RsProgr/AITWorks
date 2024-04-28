package homework;
/*
Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
Выведите на печать температуру, которая была во вторник и затем в четверг.
Найти среднюю температуру за прошлую неделю.
*/
public class Temperature {

    public static void main(String[] args) {

        int[] temperatureTallinn = {5, 2, 3, 3, 3, 4, 8,};
        System.out.println("Tallinn temperature on Tuesday: " + temperatureTallinn[1] + "\u00B0C");
        System.out.println("Tallinn temperature on Thursday " + temperatureTallinn[3] + "\u00B0C");
        int sum = 0;
        for (int i = 0; i < temperatureTallinn.length; i++) {
            sum += temperatureTallinn[i];
        }
        int averageTemperatureTallinn = sum / temperatureTallinn.length;
        System.out.println("Average temperature in Tallinn " + averageTemperatureTallinn + "\u00B0C");
    }
}
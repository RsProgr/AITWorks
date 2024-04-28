package homework;

public class Task02 {
    public static void main(String[] args) {



    double passPrice = 1000;
    int workDays = 22;
    int monthDays = 31;


    double totalTrips = (workDays * 2) + ((monthDays - workDays) * 1.5);

    // средняя стоимость одной поездки по проездному билету
    double averageTripCost = passPrice / totalTrips;


    averageTripCost = Math.round(averageTripCost * 100.0) / 100.0;


        System.out.println("Average cost of one trip on a travel ticket in January 2024: " + averageTripCost);
}
}




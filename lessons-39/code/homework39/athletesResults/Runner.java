package homework39.athletesResults;
//Задача 4. Имеется протокол результатов забега 10 спортсменов на дистанции 100 метров,
//в котором зафиксированы фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах.
//Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый
//протокол соревнования.

public class Runner implements Comparable<Runner>{
    private String lastName;
    private String firstName;
    private String registrationNumber;
    private String club;
    private double resultInSeconds;

    public Runner(String lastName, String firstName, String registrationNumber, String club, double resultInSeconds) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.resultInSeconds = resultInSeconds;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", club='" + club + '\'' +
                ", resultInSeconds=" + resultInSeconds +
                '}';
    }

    @Override
    public int compareTo(Runner o) {
        return Double.compare(this.resultInSeconds, o.resultInSeconds);
    }
}

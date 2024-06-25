package homework39.athletesResults;

public class Runner {
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
}

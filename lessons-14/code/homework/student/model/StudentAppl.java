package homework.student.model;

public class StudentAppl {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Ruslan", "Volkov", 1989, "psychologist");
        Student st2 = new Student(2, "Michael", "Serebrjannikov", 1964, "artist");
        Student st3 = new Student(3, "Alina", "Abramova", 1976, "cook");
        Student st4 = new Student(4, "Aleksei", "Popov", 2005, "programmer");

        st1.displayStudent();
        st1.study();
        st1.takeVacation();
        st1.takeExam();

        System.out.println();

        st2.displayStudent();
        st2.study();
        st2.takeVacation();
        st2.takeExam();

        System.out.println();

        st3.displayStudent();
        st3.study();
        st3.takeVacation();
        st3.takeExam();

        System.out.println();

        st4.displayStudent();
        st4.study();
        st4.takeVacation();
        st4.takeExam();

        System.out.println();
    }
}
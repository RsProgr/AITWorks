package classwork;
/*
Имеются оценки абитуриента из его аттестата, всего 20 оценок.
Найдите средний балл абитуриента.
 */

public class AverageMark {
    public static void main(String[] args) {
        int[] marks = {1, 2, 1, 2, 3, 2, 1, 3, 4, 1, 2, 3, 1, 2, 3, 4, 5, 2, 1, 1};
        System.out.println(marks.length);
        int sum0fMarks = 0;
        for (int i = 0; i < marks.length; i++) {

            sum0fMarks += marks[i];
        }

        double averageMark = (double) sum0fMarks / marks.length;
        System.out.println("Average mark: " + averageMark);
        System.out.printf("Average mark : %.2f", averageMark);
    }
}
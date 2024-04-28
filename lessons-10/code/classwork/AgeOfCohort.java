package classwork;
/*
Создайте массив, который содержит возраст студентов группы.
- какой возраст максимальный?
- какой возраст минимальный?
*/
public class AgeOfCohort {
    public static void main(String[] args) {

        int[] age0fStudent = {31, 44, 28, 39, 60, 26, 44, 45, 38, 61};
        //найдём максимальный элемент массива  и его индекс
        int max = age0fStudent[0];
        int indexMax = 0;

        for (int i = 0; i < age0fStudent.length; i++) {
            if(age0fStudent[i] > max){
                max = age0fStudent[i];
                indexMax = i;
            }
        }

        System.out.println("Max age = " + max);
        System.out.println("Index of max element: " + indexMax);
    }
}
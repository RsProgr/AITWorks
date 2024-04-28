package classwork;

public class ArrayApplication {
    public static void main(String[] args) {

        int[] numbers = {238, -96, 5, 57, -34, 77, -76, 33, -142, -208 };

        ArraysMethods.printArray(numbers);
        int max = ArraysMethods.maxOfArray(numbers);
        System.out.println("Max of array: " + max);
        int maxIndex = ArraysMethods.indexMaxOfArray(numbers);
        System.out.println("Index Max of array " +maxIndex);

       String[] day0fWeek = {"Mo", "Tu", "We", "Th", "Fr", "Sb", "Su"};
       ArraysMethods.printArray(day0fWeek);

        ArraysMethods.bubbleSort(numbers);
        ArraysMethods.printArray(numbers);
    }

}

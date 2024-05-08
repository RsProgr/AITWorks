package classwork28;

public class IntArrayListApp {
    public static void main(String[] args) {
        IntArrayList myArray = new IntArrayList();
        myArray.add(3);
        myArray.add(1);
        myArray.add(8);
        myArray.add(9);
        myArray.add(45);
        myArray.add(42);

        System.out.println(myArray);
        int removedValue = myArray.remove(2);
        System.out.println("removed value: " + removedValue);
        System.out.println(myArray);
        // вызовет ошибку
        //System.out.println(myArray.get(5));
        myArray.add(88);
        System.out.println(myArray);

        System.out.println("the end!");
    }
}
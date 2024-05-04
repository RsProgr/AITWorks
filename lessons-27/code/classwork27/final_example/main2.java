package classwork27.final_example;

public class main2 {

    public static void main(String[] args) {
        final String name = "qwerty";
        // вызывает ошибку , мы не можем переопределять final переменную
        // name = "rrrrrrr";
        System.out.println(name);
    }
}

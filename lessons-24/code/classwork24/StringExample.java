package classwork24;

import java.util.Objects;

public class StringExample {
    public static void main(String[] args) {
        //создаём пустую строку
        String shoppingList = "";

        // добавляем пункты в список покупок
        shoppingList = shoppingList + "Молоко";
        shoppingList = shoppingList + ", яйца";
        shoppingList = shoppingList + ", хлеб";
        shoppingList = shoppingList + ", шоколад";
        // вывод итоговый список покупок
        System.out.println("Список покупок: " + shoppingList);
    }

}
class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder shoppingList = new StringBuilder();
        shoppingList.append("Молоко");
        shoppingList.append(", Яйца");
        shoppingList.append(", Хлеб");
        shoppingList.append(", Шоколад");
        System.out.println("Список покупок: " +shoppingList.toString());
    }
}

class StringBuilderExample2{
    public static void main (String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("a");
        str.append(" cat");
        str.insert(0, "I have "); // в самое начало добавляется строка
       //str.delete(7, 9);
       int i = str.indexOf("cat");

       str.delete(i, i + 3);

        int haveIndex = str.indexOf("have");
       str.replace(haveIndex, haveIndex + 4, "had");
       str.append("headache"); // "I had headache

        System.out.println(str.toString());
        // создаётся новый объект StringBuilder содержащий
        // те же символы но в обратном порядке и выводим его
        System.out.println(str.reverse().toString());
    }

    class User{
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    }



// (какие то данные) -> хэш-функция -> хэш

// hashValue = hashFunction(someData)

// someData - любые данные любого размера, а конкртено в java - объекты
// hashFunction - функция хэширования, а конкртено в java - метод .hashCode
// hashValue - число фиксированной длины, а конкртено в java - int



class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class UserExample {
    public static void main(String[] args) {
        User user1 = new User("Karl", 100);
        User user2 = new User("Karl", 100);
        User user3 = new User("Karl", 101);

        System.out.println("user1 == user2: " + user1.equals(user2));
        System.out.println("user1 == user3: " + user1.equals(user3));

        System.out.println();

        System.out.println("hash(" + user1 + ") = " + user1.hashCode());
        System.out.println("hash(" + user2 + ") = " + user2.hashCode());
        System.out.println("hash(" + user2 + ") = " + user2.hashCode());
    }
}
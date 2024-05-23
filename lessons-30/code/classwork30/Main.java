package classwork30;

class MyBestClass implements Greeting{
    @Override
    public void sayHello(){
        System.out.println("Hello from MyBestClass");
    }

    @Override
    public  void sayGoodBye(){
        System.out.println("Good bye from myBestClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyBestClass myObject = new MyBestClass();

        myObject.sayHello();

        MyBestClass myObject2 = new MyBestClass();
        myObject2.sayHello();
        myObject2.sayGoodBye();

    }
}

package classwork30;

public class AnonymousExampleApp {
    public static void main(String[] args) {
        //создание анонимного класса
        // 1. нельзя будет создать второй объект с тем же поведением
        // 2. вы получите объект с типом интерфейса
        Greeting myObject = new Greeting(){
            @Override
            public void sayHello(){
                System.out.println("Hello from  Anonymous class");
            }
            @Override
            public void sayGoodBye(){
                System.out.println("Good bye from  Anonymous class ");
            }
        };
        myObject.sayHello();
        myObject.sayGoodBye();

        }
    }



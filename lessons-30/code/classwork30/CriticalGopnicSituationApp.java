package classwork30;

public class CriticalGopnicSituationApp {
    public static void main(String[] args) {
        System.out.println(
                "Человек идёт по улице и встречает" +
                        " " +
                "группу моргинальных личностей"
        );
        System.out.println("и тут он говорит:");

        Greeting speech = new Greeting(){
            @Override
            public void sayHello(){
                System.out.println("Здарова мужики");
            }

            @Override
            public void sayGoodBye(){
                System.out.println("Бывайте");
            }
        };
        speech.sayHello();
        speech.sayGoodBye();

        System.out.println("История этим и кончилась");
    }

}

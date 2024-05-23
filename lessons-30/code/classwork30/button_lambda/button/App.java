package classwork30.button_lambda.button;

public class App {
    public static void main(String[] args) {
        Action action = () ->    {
                System.out.println("Мир делается лучше, подождите немного ..... ");
                System.out.println("Мир стал лучше");

            };

        Button button = new Button("Сделать мир лучше", action);

        button.click();
    }
}

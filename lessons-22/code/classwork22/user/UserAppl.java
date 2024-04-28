package classwork22.user;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("roma19@List.ru", "7712598756");//создаем пользователя
        System.out.println(user.getEmail());// печатаем
    }
}

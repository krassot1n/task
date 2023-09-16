import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

//Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
//
//На входе коллекция пользователей.
//Необходимо удалить все дубли (одинаковое имя и возраст).
//Отсортировать по возрасту и имени.
//Вернуть самого старого пользователя.
public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(26, "Andrey"));
        users.add(new User(30, "Dasha"));
        users.add(new User(26, "Andrey"));
        users.add(new User(25, "Artem"));
        users.add(new User(24, "Masha"));

        User oldestUser = User.getOldestUser(users);
        System.out.println("Самый старый пользователь: " + oldestUser.getName() + ", его возраст равен: " + oldestUser.getAge());

    }
}
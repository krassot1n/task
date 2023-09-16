import java.util.*;

public class User {

    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
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
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static User getOldestUser(List<User> users){

        Set<User> uniqueUsers = new HashSet<>(users);
        List<User> uniqueUsersList = new ArrayList<>(uniqueUsers);

        Collections.sort(uniqueUsersList,Comparator.comparing(User::getAge).thenComparing(User::getName));

         return uniqueUsersList.get(uniqueUsersList.size() - 1);
    }
}

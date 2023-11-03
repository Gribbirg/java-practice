package Practice_4.Ex_3.Authentication;

import java.util.ArrayList;
import java.util.List;

// аутендефикация
public abstract class Authentication {
    // список пользователей
    private static final ArrayList<User> users = new ArrayList<>(
            List.of(
                    new User[]{
                            new User("grib", "1111")
                    }
            )
    );

    // добавить пользователя
    public static void addUser(User user) {
        users.add(user);
    }

    // проверить логин и пароль
    public static boolean check(String login, String password) {
        for (User user : users) {
            if (user.equals(login, password)) return true;
        }
        return false;
    }
}

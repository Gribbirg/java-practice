package Practice_4.Ex_3.Authentication;

// пользователь
public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // сравнение логинов и паролей
    public boolean equals(String login, String password) {
        return login.equals(this.login) & password.equals(this.password);
    }
}

package collections.loginPassword;

public class User {
    int userNumber;
    String user;
    String password;

    public User(int userNumber, String user, String password) {
        this.userNumber = userNumber;
        this.user = user;
        this.password = password;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userNumber +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

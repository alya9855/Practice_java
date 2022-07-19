package collections.loginPassword;

import java.util.Scanner;

import static collections.loginPassword.Main.users;

public class MainUtils {
    public static void start() {
        int number;
        do {
        System.out.println(
                "Please enter number according to the action:\n" +
                        "1- Add new user\n" +
                        "2- Delete existing user\n" +
                        "3- Verify if the user exists\n" +
                        "4- Change the login of the existing user\n" +
                        "5- Change the password of the existing user\n" +
                        "6- Finish!\n" +
                        "7 - Print into console"
        );
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        action(number);
         } while(number != 6);
    }

    public static void action(int number) {
        switch (number) {
            case 1:
                System.out.println("Please enter login and password for new User");
                addUser();
                break;
            case 2:
                System.out.println("Please delete user from existing"); //  id
                deleteUser();
                break;
            case 3:
                System.out.println("Please enter login");
                existUser();
                break;
            case 4:
                System.out.println("Please select user");
                changeLogin();
                break;
            case 5:
                System.out.println("Please select user");
                System.out.println("please enter new password");
                changePassword();
                break;
            case 6:
                System.out.println("Finish!");
                break;
            case 7:
                print();
            default:
                System.out.println("Please select number from 1-7");
                break;
        }
    }

    public static void print() {
        for (User user : users) {
            System.out.print(user + " ");
        }
    }

    public static void addUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("login");
        String login = scan.nextLine();
        System.out.println("password");
        String password = scan.nextLine();
        System.out.println("userId");
        int userId = scan.nextInt();
        users.add(new User(userId, login, password));
    }

    public static void existUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("login");
        String login = scan.nextLine();
        for (User user : users) {
            if (user.getUser().equals(login)) {
                System.out.println("The user exists in DB");
            } else {
                System.out.println("There is no users in DB");
            }
        }
    }

    public static void deleteUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id");
        int id = scan.nextInt();
        for (User user : users) {
            if (user.getUserNumber() == id) {
                users.remove(user.getUserNumber());
            } else {
                System.out.println("There is no users in DB");
            }
        }
    }

    public static void changeLogin() { ///need ask
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a new login");
        String newLogin = scan.nextLine();
        System.out.println("Add user id");
        int id = scan.nextInt();
        for (User user : users) {
            if (user.getUserNumber() == id) {
                users.set(id, new User(user.getUserNumber(), newLogin, user.getPassword()));
            } else {
                System.out.println("There is no users in DB");
            }
        }
    }

    public static void changePassword() { ///need ask
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a new Password");
        String newPassword = scan.nextLine();
        System.out.println("Add user id");
        int id = scan.nextInt();
        for (User user : users) {
            if (user.getUserNumber() == id) {
                users.set(id, new User(user.getUserNumber(), user.getPassword(), newPassword));
            } else {
                System.out.println("There is no users in DB");
            }
        }
    }

    public static void initData() {
        users.add(new User(1, "Pier", "FGFFf"));
        users.add(new User(2, "Pier2", "FGFFf"));
        users.add(new User(5, "Pier3", "FGFFf"));
    }
}

package class12;

public class Task {
    public static void main(String[] args) {


        String username = "chaymae";
        String password = "cggb214@";
        String confirmyourpassword = "cggb214@";

        if (username.isBlank() && password.isBlank()) {
            System.out.println("Username or Password cannot be empty");
        } else if ((password.length() < 8)) {
            System.out.println("Password is too short");


        }

    }
}

import java.util.Scanner;

public class p09_PasswordGuess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (pass.equals("s3cr3t!P@ssw0rd")) {   //Проверяваме дали паролата е вярна
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}

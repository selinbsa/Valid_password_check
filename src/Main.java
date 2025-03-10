import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;

        while (!isValid) {

            System.out.println("Welcome to the system. To continue, please enter your password: ");
            String password = scanner.nextLine();


            if (password.length() < 8) {
                System.out.println("Invalid Password! Try again.");
                continue;
            }


            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == ' ') {
                    System.out.println("Invalid Password! Try again.");
                    continue;
                }
            }

            char firstCharacter = password.charAt(0);
            if (Character.isLowerCase(firstCharacter)) {
                System.out.println("Invalid Password! Try again.");
                continue;
            }


            char lastCharacter = password.charAt(password.length() - 1);
            if (lastCharacter != '?') {
                System.out.println("Invalid Password! Try again.");
                continue;
            }


            System.out.println("Valid Password! Welcome.");
            isValid = true;
        }
        scanner.close();
    }
}

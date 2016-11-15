import java.util.Scanner;

/**
 * @author flo
 * @since 15/11/2016.
 */
public class MyFirstJavaProgram {

    public static void main(String[] args) {
        System.out.println("Username: ");
        String username = readValueFromConsole();
        System.out.println("Welcome " + username + "!!");

        String password = "12345";
        int counter = 0;
        boolean isValid;
        do {
            String userPassword = readValueFromConsole();
            counter ++;
//            if(counter >= 3) {
//                System.out.println("Reached max attempts!");
//                System.exit(0);
//            }
            isValid = password.equals(userPassword);
            if(isValid) {
                System.out.println("You have access!");
                System.exit(0);
            } else {
                System.out.println("ACCESS DENIED! Attempts " + counter + ".");
            }
        } while(!isValid && counter > 1 && counter < 4);
        // nimerit parola: isValid = true => !isValid = false
        // false || 1 < 4
        System.out.println("Ai gasit comoara! Din " + counter + " incercari!");
    }
















    private static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }
}

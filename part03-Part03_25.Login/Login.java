
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String alexPasswd = "sunshine";
        String emmaPasswd = "haskell";
        
        System.out.print("Enter username: ");
        String userInput = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine();
        
        if ( (userInput.equals("alex") && passwordInput.equals(alexPasswd)) 
           || (userInput.equals("emma") && passwordInput.equals(emmaPasswd))) {
            System.out.println("You have successfully logged in!");  
        } else {
            System.out.println("Incorrect username or password!");
        }
                        
    }
}


import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String userInput = scanner.nextLine();
        // repeat 3 times the word given by user
        for (int i = 0; i < 3; i++) {
            System.out.print(userInput);
        }
        /*
        //without loop
        System.out.println(userInput + userInput + userInput);
        */
    }
}

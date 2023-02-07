
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // Check to find a new string
        System.out.print("Search for? ");
        String userInput = scanner.nextLine();
        
        if (list.contains(userInput)) {
            System.out.println(userInput + " was found");
        } else {
            System.out.println(userInput + " was not found!");
        }
    }
}

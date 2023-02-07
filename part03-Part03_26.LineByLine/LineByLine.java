
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Ask user for input
        while (true) {
        String userInput = scanner.nextLine();
        
        if (userInput.equals("")) {
            break;
        }
        
        String[] parts = userInput.split(" ");
        
            for (String word : parts) {
                System.out.println(word);
            }
        
        }
        
        


    }
}

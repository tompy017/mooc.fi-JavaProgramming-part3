
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        String longestName = "";
        int sumOfYears = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            count++;
            
            String[] data = input.split(",");
            String name = data[0];
            int birthYear = Integer.valueOf(data[1]);
            
            sumOfYears += birthYear;
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        double avg = (1.0 * sumOfYears) / count;
                
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}

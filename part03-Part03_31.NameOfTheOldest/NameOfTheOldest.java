
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        String nameOfOldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);

            
            if (age > oldest) {
                oldest = age;
                nameOfOldest = data[0];
            }    
        }
        
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}

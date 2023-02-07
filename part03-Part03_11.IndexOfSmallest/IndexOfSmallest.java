
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 9999) {
                break;
            }
            
            list.add(userInput);       
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = Collections.min(list);
        System.out.println("Smallest number: " + smallest);
        
        for (Integer number : list) {
            if (number == smallest) {
                System.out.println("Found at index: " + list.indexOf(number));
            }
        }
    }
}


import java.util.ArrayList;
import java.util.Scanner;


public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            //System.out.println("Give a number (-1 to exit).");
            int luku = Integer.valueOf(scanner.nextLine());
            
            if (luku == -1) {
                break;
            }
            // add the numbers to a the list (except -1)
            numbers.add(luku);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

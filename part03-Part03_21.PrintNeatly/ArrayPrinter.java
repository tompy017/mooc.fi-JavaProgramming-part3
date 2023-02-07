
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        for (int i = index; i < array.length; i++) {
            System.out.print(array[i]);
            // print comma and spaces except for the last elemnt
            if (array.length - i > 1){
                System.out.print(", ");
            }
        }
    }
}

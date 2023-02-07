
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        list.add("hola hola");
        list.add("messi goat");
        list.add("tommy");
        list.add("the ultimo");
        
        ArrayList<String> emptyList = new ArrayList<>();
        
        System.out.println("List:");
        System.out.println(list);
        System.out.println("Empty list");
        System.out.println(emptyList);
        
        
        removeLast(list);
        removeLast(emptyList);
        
        System.out.println(list);
        
        /*
        System.out.println("Type of list: " + list.getClass().getSimpleName());
        System.out.println("and " + list.getClass().getTypeName()); //type + package
        */
    }
    
    
    public static void removeLast(ArrayList<String> strings) {
        // if the list is empty, the method does nothing
        if (strings.size() == 0){
            return;
        }
        
        int lastItem = strings.size() - 1;  // obtener el index del ultimo elemento de la lista
        strings.remove(lastItem);
        
    }
}

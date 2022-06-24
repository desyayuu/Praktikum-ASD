import java.util.Collections;
import java.util.Stack;

public class ModifikasiLoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");
        System.out.println("SEBELUM DI SORTING");

        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        System.out.println("SETELAH DI SORTING");
        Collections.sort(fruits);
        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }
    }
}

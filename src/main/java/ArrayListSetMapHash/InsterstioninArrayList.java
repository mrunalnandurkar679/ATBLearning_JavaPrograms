package ArrayListSetMapHash;

import java.util.LinkedList;
import java.util.List;

public class InsterstioninArrayList {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.add(1,"Orange");
        System.out.println(fruits);

    }
}

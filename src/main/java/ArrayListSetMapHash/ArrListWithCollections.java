package ArrayListSetMapHash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrListWithCollections {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        arr.add("Geeks");
        arr.add("for");
        arr.add("Geeks");
        System.out.println("Arraylist before collections : " + arr);
        System.out.println("Arraylist after collections");
        Collections.addAll(arr, "website", "secure");
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println("Arraylist after reverse: " + arr);
        Collections.sort(arr);
        System.out.println(arr);
        boolean result = arr.contains(value);

        System.out.println("arrlist contains  " +value +"  " +result);
    }
}

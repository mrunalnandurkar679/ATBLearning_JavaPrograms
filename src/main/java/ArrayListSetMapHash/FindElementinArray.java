package ArrayListSetMapHash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindElementinArray {
    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("Mumbai");
        city.add("Delhi");
        city.add("Pune");
        city.add("Nagpur");
        System.out.println(city);
        if(city.contains("Pune"))
        {
            System.out.println("Pune is in the list");
        }
        else
        {
            System.out.println(city);
        }



    }
}

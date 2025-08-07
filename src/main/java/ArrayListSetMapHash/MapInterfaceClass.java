package ArrayListSetMapHash;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceClass {
    public static void main(String[] args) {


        Map<String, Integer> students = new HashMap<>();
       students.put("Rahul", new Integer(100));
       students.put("Mrunal", new Integer(1001));

        System.out.println(students);
        System.out.println(students.get(100));
        System.out.println(students.containsValue(1001));
        for (Map.Entry<String, Integer> list : students.entrySet() )
        {
            System.out.println(list.getKey()   +" : " +list.getValue() );
        }




    }

}

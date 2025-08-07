package ArrayListSetMapHash;

import java.util.HashMap;
import java.util.Map;

public class UpdateHashMap {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("Mrunal", 32);
        list.put("Rahul", 33);
        System.out.println(list);
        for(Map.Entry<String, Integer> age : list.entrySet())
        {
            System.out.println(age.getKey() +" : " +age.getValue());
        }
    }
}

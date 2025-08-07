package ArrayListSetMapHash;

import java.util.*;

public class SortTheArrayWithListMap {
    public static void main(String[] args) {
        int[] arr = {1,34,23,1,11,23,34,23,1,1,1,54,34,76,98};

        List<Integer> al = new ArrayList<>();

        // putting all numbers in the array list

        for(int j=0; j<arr.length; j++) {
            al.add(arr[j]);

        }
        System.out.println(al);

        // counting the reoccurance of the numberwith any Hashmap
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0 ; i<al.size(); i++)
        {
            hm.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));

        }
        System.out.println(hm);


    }
}

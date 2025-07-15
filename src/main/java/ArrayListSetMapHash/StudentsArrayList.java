package ArrayListSetMapHash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentsArrayList {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Dipak");
        name.add("Ravi");
        name.add("Sneha");
        name.add("Priya");
        name.add("Anjali");
        System.out.println(name);



        for (String student : name)
        {
            System.out.println(student);
        }
    }
}

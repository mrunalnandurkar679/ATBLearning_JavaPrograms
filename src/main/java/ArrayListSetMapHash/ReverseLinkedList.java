package ArrayListSetMapHash;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args)  {
        LinkedList marks = new LinkedList();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);

        System.out.println(marks);

        //AProach 1

//        for(int i = marks.size()-1; i<0; i--)
//        {
//            System.out.println(marks.get(i));
//        }

        //AProach 2
        Collections.reverse(marks);
        System.out.println(marks);

    }
}

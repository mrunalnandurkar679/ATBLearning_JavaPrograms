package ArrayListSetMapHash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxMethod_Collection_withException {
    public static void main(String[] args) throws Exception {
        List<String> coll = new ArrayList<>();
        try{
        coll.add("Maximum");
        Object i = Integer.valueOf(42);
        coll.add((String)i);
            System.out.println(coll);
    }
        catch (ClassCastException e)
        {
            System.out.println("Maximum can not find from the String array" +e);
        }
        try
        {
            System.out.println( Collections.emptyList());
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Can not get any element form the empty list "+e);
        }
    }

}

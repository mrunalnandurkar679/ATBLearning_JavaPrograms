package ArrayListSetMapHash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListWithException {

    public static void main(String[] args) {

        try{
            arraylistDemo();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

     static void arraylistDemo()
    {
        List<String> arr = new ArrayList<>();

        throw new NullPointerException("ARray list can not be empty");

    }
}

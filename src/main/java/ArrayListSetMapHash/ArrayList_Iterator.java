package ArrayListSetMapHash;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayList_Iterator {
    public static void main(String[] args) throws Exception {


        List<String> arr = new ArrayList<>();
        arr.add("Banana");
        arr.add("Apple");
        arr.add("Kiwi");
        arr.add("Grapes");
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        try {
            arr.remove("grapes");
            System.out.println(arr);
        } catch (Exception e) {
            System.out.println("No such element found" + e);
        }
        Iterator<String> i = arr.iterator();

        while (i.hasNext())
        {
            String n = i.next();
            System.out.println(n);
        }
    }
}

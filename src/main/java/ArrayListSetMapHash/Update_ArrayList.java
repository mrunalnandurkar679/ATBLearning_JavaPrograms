package ArrayListSetMapHash;

import java.util.ArrayList;
import java.util.List;

public class Update_ArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");
        System.out.println(names);
        names.remove("Neha");
        System.out.println(names);

    }
}

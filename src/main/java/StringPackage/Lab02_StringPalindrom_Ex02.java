package StringPackage;

import java.util.Scanner;

public class Lab02_StringPalindrom_Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toLowerCase();
        boolean res = isPalindrom(input);
        if(res)
        {
            System.out.println(input+ ".....is palindrom");
        }
        else
        {
            System.out.println(input+"...... is not palindrom");
        }
        System.out.println(reversString(input));

    }

    static String reversString(String userinput) {

        String reversed = "";

        for (int i = userinput.length() - 1; i >= 0; i--) {
            reversed += userinput.charAt(i);
        }

        if (reversed.equals(userinput)) {
            System.out.println("string is pandroma");
        } else {
            System.out.println("string is not panadrom ");
        }
        return reversed;
    }

    static boolean isPalindrom(String userinput)
    {
        String rev = "";
        for (int i = userinput.length()-1; i>=0; i--)
        {
            rev += userinput.charAt(i);
        }

        return userinput.equals(rev);
    }

}

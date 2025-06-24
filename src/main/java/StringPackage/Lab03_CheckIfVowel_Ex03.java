package StringPackage;

import java.util.Locale;
import java.util.Scanner;

public class Lab03_CheckIfVowel_Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next().toLowerCase();
        System.out.println(returnVowel(name));
    }
    static String returnVowel(String userInput)
    {

        for (int i = 0; i<userInput.length()-1; i++)

        {
            char ch = userInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
            {
                System.out.println(ch +"--->user input contains vowels ");
            }
            else
            {
                System.out.println(ch +"--->user input contains constan");
            }

        }return userInput;
    }
}

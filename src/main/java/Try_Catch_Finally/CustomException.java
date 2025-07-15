package Try_Catch_Finally;

import java.util.Scanner;

public class CustomException {

    static int validAge (int age) throws Exception
    {
        if (age<18)
            throw new Exception("Age can not be below 18");

        return age;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the valid age");
        int age = scan.nextInt();
        try {
            validAge(age);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }



    }
}

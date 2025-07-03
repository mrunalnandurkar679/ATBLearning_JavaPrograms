package ArrayListPackage;

import java.util.Scanner;

public class Lab09_CheckValueInArray_Ex09 {
    public static void main(String[] args) {
      int[] arr = {65,78,98,23,45,90};
      Scanner scan = new Scanner(System.in);
        System.out.print("enter the user input : ");
      int num = scan.nextInt();
        System.out.println(checkValue(num, arr));

    }
    static boolean checkValue(int num, int[] arr) {
        for (int element : arr) {
            if (num == element) {
                return true;
            }

        }

        return false;
    }
}

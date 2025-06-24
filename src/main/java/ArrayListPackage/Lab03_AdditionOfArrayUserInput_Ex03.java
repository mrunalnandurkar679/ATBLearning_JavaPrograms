package ArrayListPackage;

import java.util.Scanner;

public class Lab03_AdditionOfArrayUserInput_Ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] number = new int[n];
        System.out.println(addition(number));
    }
    static int addition(int[] number) {
        int total = 0;
        for (int num : number)
        {
            total += num;
        }
        return total;

    }


}

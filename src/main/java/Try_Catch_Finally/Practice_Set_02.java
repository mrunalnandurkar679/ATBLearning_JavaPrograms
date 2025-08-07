package Try_Catch_Finally;

import java.util.Scanner;

public class Practice_Set_02 {
    public static void main(String[] args) throws maxRetiresExceptions {
       boolean flag = true;
       int[] marks = new int[3];
       marks[0] = 45;
       marks[1] = 98;
       marks[2] = 42;
        Scanner scan = new Scanner(System.in);

        int i =0;

            while (flag && i <= 4) {
                try {
                    System.out.println("enter the valid index");
                    int num = scan.nextInt();
                    System.out.println("Value of marks index is " + marks[num]);
                    break;
                } catch (Exception e) {
                    System.out.println("invalid index");
                    i++;
                }
            }
        if(i>=5)
        {
            throw new maxRetiresExceptions();
        }
    }

    static class maxRetiresExceptions extends Exception {
        @Override
        public String toString() {
           return "retries exceed the limits";
        }

        @Override
        public String getMessage() {
            return "tries can not be reached more than 5";
        }
    }
}

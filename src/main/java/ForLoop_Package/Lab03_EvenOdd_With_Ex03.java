package ForLoop_Package;

import java.util.Scanner;

public class Lab03_EvenOdd_WithBreal_Ex03 {

    public static void main(String[] args) {
       int i =0;
       evenOdd(i);
    }

    static void evenOdd(int i) {
        for (i=0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("numbe is even :" +i);

            }
            else {
                System.out.println("number is odd");
            }


        }

    }

}



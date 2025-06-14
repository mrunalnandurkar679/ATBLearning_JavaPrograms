package Increment_Package;

public class Lab07_IncrementProgram_07 {


        public static void main(String[] args) {
            int x = 10; //14
            int y = ++x + ++x + x++ + ++x;  //11 + 12 + 12 + 14

            System.out.println("x = " + x + ", y = " + y);  //14 ,49
        }
    }


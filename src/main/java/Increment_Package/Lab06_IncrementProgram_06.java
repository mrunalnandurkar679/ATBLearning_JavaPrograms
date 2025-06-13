package Increment_Package;

public class Lab06_IncrementProgram_06 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;  // 5 + 7 + 7 + 9

        System.out.println("x = " + x + ", y = " + y);  // 9 28
    }
}

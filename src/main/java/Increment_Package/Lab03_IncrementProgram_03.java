package Increment_Package;

public class Lab03_IncrementProgram_03 {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;  // 1 + 3

        System.out.println(i); //4
    }
}

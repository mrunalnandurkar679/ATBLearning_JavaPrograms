package Condiational_Programs;

public class Lab03_EvenOddNumber_03 extends LAB02_VotingAge_02 {
    static int num = scan.nextInt();
    public static void main(String[] args) {
        Lab03_EvenOddNumber_03.Number();

    }
    public static void Number()
    {
        if (num %2 == 0)
        {
            System.out.println("number is odd");
        }
        else
        if(num ==0)
        {
            boolean ArithmeticException;
            throw new ArithmeticException("number can not be divisible");
        }
        else {
            System.out.println("number is negative");
        }
        {
            System.out.println("number is even");
        }
    }
}

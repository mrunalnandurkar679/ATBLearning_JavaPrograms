package OOPSConcepts.MethodOverLoading;

public class Lab01_Oops_MethodOverload_AddingNum {
    public static void main(String[] args) {
        calculator cal = new calculator();
        cal.add(12, 13);
        cal.add(34, 45, 56);

    }

}

class calculator
{
   int a = 0; int b = 0; int c =0;   // if values are specific for the variables then can use calss variables
     int add(int num1 , int num2)
    {
        this.a = num1;
        this.b = num2;
        int sum;
        System.out.println( sum = num1+num2);
        return sum;

    }

    int add (int num1, int num2, int num3)
    {
        this.a = num1;
        this.b = num2;
        this.c = num3;
        int sum;
        System.out.println(sum = num1+num2+num3);

        return sum;
    }


}

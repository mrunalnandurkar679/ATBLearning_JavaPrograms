package OOPSConcepts_MethodOverLoading;
//Title: Find max using overloaded functions//
//        Description:
//        Create a class Utility with two methods named max():/
//        max(int a, int b) returns the larger of two integers/
//        max(int a, int b, int c) returns the larger of three integers//
//        max(double a, double b) returns the larger of two decimal values
//        Add method calls in main() to compare different types.


import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Lab02_FindMaxNumWithOverloadingFun {
    public static void main(String[] args) {
        Maximum m = new Maximum();
        int a = Maximum.a;
        int b = Maximum.b;
        int c = Maximum.c;
        m.max(a, b);
        m.max(a,b,c);

    }
}

class Maximum
{
    static int a = 400;
    static int b = 50;
    static int c = 100;

    int max(int num1, int num2)
    {
        this.a = num1;
        this.b = num2;
        int max = 0;
        if(num1>num2)
        {
            System.out.println("max: " +num1);
        }
        else {
            System.out.println("max: " +num2);
        }

        return max;
    }
    void max(int num1, int num2, int num3)
    {

        this.c = num3;

        if(num1>num2 && num1>num3)
        {
            System.out.println("max: " +num1);
        }
        else if(num2>num1 && num2>num3) {
            System.out.println("max: " +num2);
        }
        else
        {
            System.out.println("max :" +num3);
        }


    }
}

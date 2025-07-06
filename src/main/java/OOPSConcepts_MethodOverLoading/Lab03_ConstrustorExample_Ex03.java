package OOPSConcepts_MethodOverLoading;

import java.util.Scanner;

public class Lab03_ConstrustorExample_Ex03 {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();

    int b = scan.nextInt();
    int sum ;
    Lab03_ConstrustorExample_Ex03()
    {
        int mul = a*b;
        System.out.println("mul : " +mul);
    }
    Lab03_ConstrustorExample_Ex03(float c)
    {
        float mul = a*b*c;
        System.out.println("mul : " +mul);
    }
    public static void main(String[] args) {
        Construct c = new Construct();
        Lab03_ConstrustorExample_Ex03 lab = new Lab03_ConstrustorExample_Ex03(20);



    }

    }

    class Construct extends  Lab03_ConstrustorExample_Ex03
    {
        int sub;


        Construct()
        {
            super();
            super.sum = super.a + super.b;// calling parent calss variable
            this.sub = super.a - super.b;
            System.out.println(sum +"\n" +sub);


        }



        }


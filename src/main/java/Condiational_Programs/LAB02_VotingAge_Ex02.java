package Condiational_Programs;
import java.util.Scanner;




    public class LAB02_VotingAge_Ex02 {
        static Scanner scan = new Scanner(System.in);

        static int votingage =18;
        static int age = scan.nextInt();
        public static void main(String[] args) {
            LAB02_VotingAge_Ex02.vote();

        }

        public static void vote()
        {
            if (age>=votingage)
            {
                System.out.println("Eligible for the voting");
            }
            else {
                System.out.println("Age is unappropriate");
            }

        }
    }

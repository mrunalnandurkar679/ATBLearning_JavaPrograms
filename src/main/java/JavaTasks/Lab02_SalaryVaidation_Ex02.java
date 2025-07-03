package JavaTasks;

import java.util.Scanner;

public class Lab02_SalaryVaidation_Ex02 {

//    Check if a Person is Eligible for a Loan (Based on Age, Salary, .and Credit Score)//
//    * Take the below User info and store it into the variables://
//    Age (integer)//
//    Salary (double or float)//
//    Credit Score (integer)//
//    Age Validation://
//            :- Check if the age is a positive integer.//
//            :- Ensure the age is at least 18 years old.//
//            :- Max age can be 80.//
//    Salary Validation://
//            :- Check if the salary is a positive number.//
//            :- Define a minimum salary threshold (e.g., 30,000).//
//    Credit Score Validation://
//            :- Check if the credit score is a positive integer.//
//             :- Define a minimum credit score threshold (e.g., 650).//
//            :- Max credit score threshold (e.g., 850).

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        float salary = scan.nextFloat();
        int creditScore = scan.nextInt();

        loan(age,creditScore,salary);
    }
    static void loan(int age, int creditScore, float salary)
    {
       boolean isAgeIsValid =(age>=18 && age<=80);
       boolean isSalaryIsValid = salary>=30000f;
       boolean isValidCreditScore= (creditScore >=650 && creditScore <=850);

        if (!isAgeIsValid)
        {
            System.out.println("Age is not valid for loan approval");
        }
        if(!isSalaryIsValid)
        {
            System.out.println("salary is not enough for loan approval");
        }
        if (!isValidCreditScore)
        {
            System.out.println("Credit Score is not enough");
        }
        if(isSalaryIsValid && isAgeIsValid && isValidCreditScore)
        {
            System.out.println(" eligible for the loan" );
        }
        else
        {
            System.out.println("not eligible for the loan" );
        }
        return;

    }
}

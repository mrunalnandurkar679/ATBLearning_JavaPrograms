package JavaTasks;
//Find if a Person Can Travel Based on Visa Status and Age.//
//        take the input from the user for//
//        Age (integer).//
//        Visa Status (String or boolean).//
//        Check Eligibility://
//        :- If age is 18 or older and visa status is valid, the person can travel.//
//        Otherwise, the person cannot travel.//
//        Validation Criteria//
//        Age: - Must be a non-negative integer.//
//        :- Should be greater than or equal to 18 to be eligible to travel.//
//        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").//
//        :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa./


import java.util.Scanner;

public class Lab05_PersonTravle_Ex05 {
    public static void main(String[] args) {
        // Take age input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = -1;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Age must be a non-negative integer.");
            scanner.close();
            return;
        }

        if (age < 0) {
            System.out.println("Invalid input. Age must be a non-negative integer.");
            scanner.close();
            return;
        }

        scanner.nextLine(); // consume the leftover newline

        // Take visa status input
        System.out.print("Enter your visa status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();

        if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status. Please enter 'valid' or 'invalid'.");
            scanner.close();
            return;
        }

        boolean isVisaValid = visaStatus.equals("valid");

        // Check eligibility
        if (age >= 18 && isVisaValid) {
            System.out.println("You are eligible to travel.");
        } else {
            System.out.println("You are not eligible to travel.");
        }

        scanner.close();
    }

}

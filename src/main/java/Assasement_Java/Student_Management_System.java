package Assasement_Java;

import java.util.Scanner;

public class Student_Management_System {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int roll_no = scan.nextInt();
        String section = scan.next();
        students_details(name, roll_no, section);

    }

    static void students_details(String name, int roll_no, String section)
    {
        System.out.println("Student : " +name+", "+"Roll No: " +roll_no+", " +"section: " +section);
    }
}


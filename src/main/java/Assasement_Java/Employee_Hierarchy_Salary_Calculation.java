package Assasement_Java;

public class Employee_Hierarchy_Salary_Calculation {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        manager.salary();
        developer.salary();

    }
}

class Employee
{
    void salary()
    {
        System.out.println("Employee salary is :");
    }
}

class Manager extends Employee
{
    int basSalary = 60000;
    int bonus = 10000;
    int salary = basSalary+bonus;
    void salary()
    {
        System.out.println("Manager salary: " +salary);
    }
}

class Developer extends  Employee{
    int rate = 50;
    int hours = 160;
    int slalary = rate*hours;
    void salary()
    {
        System.out.println("developer salary: "+slalary);
    }
}

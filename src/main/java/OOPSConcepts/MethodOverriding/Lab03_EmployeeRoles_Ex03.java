package OOPSConcepts.MethodOverriding;

public class Lab03_EmployeeRoles_Ex03 {
    public static void main(String[] args) {
        Employee t = new Tester();
        t.role();
        Employee c = new Clerk();
        c.role();
        Employee m = new Manager();
        m.role();


    }
}

class Employee
{
    void role ()
    {
        System.out.println("Employee general information : ");
    }
}

class Manager extends Employee
{
    void role()
    {
        super.role();
        System.out.println("manages the team ");
    }
}

class Clerk extends Employee
{
    void role()
    {
        super.role();
        System.out.println("Getting the project requirments : ");
    }
}

class Tester extends Employee
{
    void role()
    {
        super.role();
        System.out.println("Qaulifing the project :  ");
    }
}



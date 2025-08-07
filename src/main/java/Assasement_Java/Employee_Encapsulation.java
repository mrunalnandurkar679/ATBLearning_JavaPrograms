package Assasement_Java;

public class Employee_Encapsulation {
    private String id ;
    private String name;
    private int salary;
    public static void main(String[] args) {
        Employee_Encapsulation e = new Employee_Encapsulation("1", "John Doe", 50000 );

    }

    Employee_Encapsulation(String id, String name, int salary)
    {
        this.id = id;
        this.name= name;
        this.salary =salary;

        System.out.println("Employee ID: " +id +", " +"Employee name : " +name +", " +"Salary : "+salary);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }



}

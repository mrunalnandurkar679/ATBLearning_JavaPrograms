package OOPSConcepts;

public class Lab01_Person_Ex01 {
    public static void main(String[] args) {
        Person p1 = new Person("Mrunal", 9096966883l, "KeshavNagar");
        System.out.println(p1.address +"\n"  +p1.name +"\n" +p1.phoneNumber);

    }
}

class Person{   // class
    String name ;
    long phoneNumber;
    String address;

    Person(String user_name, long user_phoneNumber, String user_address)   //cunstructor parameterized
    {
       this.address = user_address;  // calling class variable into custructor
       this.name = user_name;         // calling class variable into custructor
       this.phoneNumber = user_phoneNumber;    // calling class variable into custructor



    }

}



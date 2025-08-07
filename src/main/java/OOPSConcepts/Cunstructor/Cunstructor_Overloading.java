package OOPSConcepts.Cunstructor;

public class Cunstructor_Overloading {
    public static void main(String[] args) {
        Students st = new Students("AVM", 'A', 15, "Mrunal");

    }
}

class Students
{
    String schoolname;

    char div;
    Students(String schoolname, char div, int id, String name)
    {
        this.div = div;
        this.schoolname = schoolname;

        System.out.println("Student1 information : " +"School Name : "+schoolname +" " +"Div : "  +div +"id : "+" " +id +"Student Name :"+" " + name);

    }
}

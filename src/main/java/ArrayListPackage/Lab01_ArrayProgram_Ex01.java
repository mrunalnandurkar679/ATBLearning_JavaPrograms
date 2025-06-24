package ArrayListPackage;

public class Lab01_ArrayProgram_Ex01 {
    public static void main(String[] args) {

        int[] marks = {98, 87, 76, 76, 78};
        String[] students = {"Ram", "Shubham", "Mrunal", "Harry", "Rahul"};
        System.out.println(marks[0] +" " +students[0]);
        for (int i=0; i<students.length; i++)
        {
            System.out.print(students[i]);
            for(int j = 0; j<marks.length; j++)
            {
                System.out.print(" " +marks[j] +"  ");
            }
            System.out.println();

        }

    }
}

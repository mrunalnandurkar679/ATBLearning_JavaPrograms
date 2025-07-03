package ArrayListPackage;

public class Lab12_jaggedArrayPattern_Ex12 {
    public static void main(String[] args) {
//        *
//        **
//        ***

        for (int i=0; i<=3; i++)
        {
            for(int j=0; j<=3; j++)
            {
                if (j<i)
                {
                    System.out.print("*");
                }
            }
            System.out.println( " ");
        }
    }
}

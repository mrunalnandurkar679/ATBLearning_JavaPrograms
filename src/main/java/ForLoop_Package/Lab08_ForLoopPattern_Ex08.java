package ForLoop_Package;

public class Lab08_ForLoopPattern_Ex08 {
    public static void main(String[] args) {
        for (int j =1; j<=5; j++)
        {
            for (int i=1;i<=j; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

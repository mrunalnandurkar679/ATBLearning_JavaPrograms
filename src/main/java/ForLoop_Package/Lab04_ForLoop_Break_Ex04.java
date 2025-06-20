package ForLoop_Package;

public class Lab04_ForLoop_Break_Ex04 {



    public static void main(String[] args) {
        int i=0;
        breakFun(i);
    }
    public static void breakFun(int i)
    {
       for (i = 0 ; i <100; i++)
       {
           if (i == 10)
           {
               break;   // condition match execution exit from the loop

           }
           System.out.println("Want to become an automation engineer" +i);



       }
    }
}

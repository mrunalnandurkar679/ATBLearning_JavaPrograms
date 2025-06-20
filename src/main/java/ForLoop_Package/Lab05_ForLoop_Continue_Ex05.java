package ForLoop_Package;

public class Lab05_ForLoop_Continue_Ex05 {

    public static void main(String[] args) {
            int i=0;
            continueFun(i);
        }
        public static void continueFun(int i)
        {
            for (i = 0 ; i <100; i++)
            {
                if (i == 10)
                {
                    continue;   // only (i == 10) will be skipped rest all execution will be executed
                }
                System.out.println("Want to become an automation engineer" +i);



            }
        }
    }



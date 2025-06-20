package ForLoop_Package;

public class Lab06_WhileWithBreak_Ex06 {
    public static void main(String[] args) {

        int i =0;
        whileBreak(i);

    }
    static void whileBreak(int i)
    {

        while (i < 10)
        {

            if (i == 4)
            {

                break;
            }
            i++;
            System.out.println("Want to become an automation engineer :" +i);

        }

    }
}

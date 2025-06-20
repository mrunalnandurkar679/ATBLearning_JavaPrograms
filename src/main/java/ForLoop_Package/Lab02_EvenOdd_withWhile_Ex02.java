package ForLoop_Package;

public class Lab02_EvenOdd_withWhile_Ex02 {
    public static void main(String[] args) {
        int i=1;
        evenOddcal(i);

    }
    static void  evenOddcal(int i) {

        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println("the number is even " +i);

            } i++;
            }


    }


}

package Try_Catch_Finally;

import java.util.Scanner;

public class Arithmetic_ArrayIndexOutOfBounds_Exception {
    public static void main(String[] args) {

        int arr[] = new int [3];
        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 89;

        Scanner scan = new Scanner(System.in);
        int ind = scan.nextInt();

        int number = scan.nextInt();



        try{
            System.out.println("enter the array index: " +arr[ind]);
            System.out.println("divid the array with the number :" +arr[ind]/number);

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("can not entered the value Index reached out of the limit");
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("number can not be divisible by 0 ");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Some other exception occured");
            System.out.println(e);
        }
        finally {
            System.out.println("execute the code");
        }
    }
}

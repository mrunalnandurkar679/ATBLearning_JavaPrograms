package ArrayListPackage;

import java.util.Scanner;

public class Lab08_SecondSmallestNum_Ex08 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter teh size of an array");
//        int size = scan.nextInt();
//        int[] num_array = new int[size];
//        for (int i =0; i<num_array.length; i++) {
//            num_array[i] = scan.nextInt();
//            System.out.println("entered the number");
//        }
//        System.out.println(" ---- Below Code is printing the elements! ");
//
//        for (int element : num_array)
//        {
//            System.out.println(element);
//        }
        int[] num_array = {562,452,762};
        System.out.println(secondLargestNum(num_array));
        System.out.println(secondSmallestNum(num_array));


    }
    static int secondSmallestNum(int[] arr) {
        int smallest_num = arr[0];
        int secondsmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallest_num > arr[i]) {
                secondsmallest = smallest_num;
                smallest_num = arr[i];

            } else
                if (secondsmallest > arr[i] && smallest_num != arr[i]) {

            }

        }
        return secondsmallest;
    }
    static int secondLargestNum(int[] arr) {
        int largestNum = arr[0];
        int secondlargest = arr[0];

        for(int i =0; i<arr.length; i++)
        {

            if (arr[i]>largestNum)
            {
                secondlargest = largestNum;  // previous largest num assigned to
                largestNum = arr[i];  // new largest num ssigned to largestnum
            }
            else if(arr[i]>secondlargest && largestNum !=arr[i])
            {

            }

    } return secondlargest;
    }
}

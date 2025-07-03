 package ArrayListPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06_LargestEleArray_Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {400, 150, 123, 432, 478, 456};
        System.out.println("largest number is "+(largestNum(arr)));
        System.out.println("smallest number is "+(smallestNum(arr)));
        maxArray(arr);
    }

    static int largestNum(int[] arr) {

        int max=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }

        }  return max;

    }

    static int smallestNum(int[] arr)
    {
        int min =arr[0];
        for(int j =0; j<arr.length; j++ )
        {
            if (arr[j]<min)
            {
                min = arr[j];
            }
        }return min;
    }

    static void maxArray(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

    }
}
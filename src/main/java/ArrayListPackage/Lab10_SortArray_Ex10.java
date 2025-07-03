package ArrayListPackage;

import java.util.Arrays;

public class Lab10_SortArray_Ex10 {
    public static void main(String[] args) {
        int[] arr1 = {23, 0, -12, -2, 98, 70};
        char[] arr2 = {'q', 'w', 'e','m','r'};
        charArr(arr1);
        sortarr(arr2);
        String name = "mrunal";
        String name2 = "MRUNAL";
                System.out.println(name.compareToIgnoreCase(name2));
        System.out.println(name.intern());


    }

     static void charArr(int[] num_arr)
    {

       Arrays.sort(num_arr);
       int i ;

        for ( i=0; i<num_arr.length;i++)
        {
            System.out.println("sorted arrays : " +num_arr[i]);
        }

    }
    static void sortarr(char[] char_arr)
    {
        Arrays.sort(char_arr);
        for(int i = 0; i<char_arr.length;i++)
        {
            System.out.println("Sorted array list : "+char_arr[i]);
        }
    }
}

package ArrayListPackage;

import java.util.Arrays;

public class Lab11_SortDuplicateElement_Ex11 {
    public static void main(String[] args) {
        int[] array =  {1,2,3,3,2,1,4,4};
        Arrays.sort(array);
        for(int j = 0 ; j<array.length; j++)
        {
            int newArray = array[j];
            System.out.println(" new Array :" +newArray);
        }

        int newsize = duplicateEle(array);

        for (int i =0; i<newsize; i++)
        {
            System.out.println("print the new list of an array :" +array[i]);
        }

    }

    static int duplicateEle(int[] arr)
    {

        int element = 1;   // duplicate element coparision msut started from 2nd element of an array.
        for(int i =1; i<arr.length; i++)
        {
           if( arr[i] != arr[i-1])
           {
               arr[element++] = arr[i];
           }

        } return element;
    }
}

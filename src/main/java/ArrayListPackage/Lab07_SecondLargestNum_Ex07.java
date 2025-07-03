package ArrayListPackage;

public class Lab07_SecondLargestNum_Ex07 {
    public static void main(String[] args) {
        int[] arr = {12,76,45,90,43,56};
        System.out.println(secondLargestNum(arr));
    }

    static int secondLargestNum(int[] arr)
    {
        int largest= arr[0];
        int secondLargest = arr[0];

        for (int i =0; i<arr.length; i++)
        {
            if (arr != null || arr.length<2)
            {
                throw new RuntimeException("not a valid array ");
            }
           if( arr[i]>largest)
           {
               secondLargest = largest;  // old largest is the secondlargest
               largest = arr[i];  // largest number of array assign to largest
               {
                   System.out.println(largest);
               }

           } else if(arr[i]>secondLargest && arr[i] !=largest)
           {
                secondLargest = arr[i];
           }

        }
        return secondLargest;
    }
}

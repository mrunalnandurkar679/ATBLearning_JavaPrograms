package ArrayListPackage;

public class Lab05_AddintionOf2DimentionArray_Ex05 {
    public static void main(String[] args) {
        int[][] mat1 = {{11,14,56},{87,98,67}};
        int[][] mat2 = {{23,54,65},{43,25,76}};

        int [][] result = {{0,0,0},{0,0,0}};

        for (int i =0; i<mat1.length; i++)
        {
            for (int j =0 ; j< mat1[i].length; j++)
            {

                result[i][j]= mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

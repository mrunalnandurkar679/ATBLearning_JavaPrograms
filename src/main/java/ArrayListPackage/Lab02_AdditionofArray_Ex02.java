package ArrayListPackage;

public class Lab02_AdditionofArray_Ex02 {
    public static void main(String[] args) {
        float[] num = {45.7f, 76.8f, 63.4f, 99.2f, 11.0f};

        System.out.println(sum(num));
    }

    static  float sum(float[] num) {
        float total = 0.0f;
        {
            for (float number : num)
            {
                total += number;
            }


        } return total;



    }
}


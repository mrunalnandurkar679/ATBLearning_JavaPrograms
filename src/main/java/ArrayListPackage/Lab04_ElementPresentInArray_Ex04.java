package ArrayListPackage;

public class Lab04_ElementPresentInArray_Ex04 {
    public static void main(String[] args) {
        int[] num = {100,156,143,176,897,453};
        Boolean isElement = false;
        int number =897;

        for (int element : num) {
            if (element == number) {
                isElement = true;
                break;
            }
        }
            if (isElement)
            {
                System.out.println("element is  available ");
            }
            else
            {
                System.out.println("elements are not  there ");
            }
        }
    }


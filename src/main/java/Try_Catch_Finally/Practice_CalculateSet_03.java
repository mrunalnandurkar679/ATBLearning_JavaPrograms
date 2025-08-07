package Try_Catch_Finally;

public class Practice_CalculateSet_03  {
    public static void main(String[] args) throws InvalidInputExceptions, CannotDevidedByZeroExcetions, MaxInputException {
        CustomCal c = new CustomCal();
        c.sum(7,6);
        c.div(8,5);
        c.mul(1000000, 90);

    }
}
class CustomCal {
    double sum(int a, int b) throws InvalidInputExceptions {
        if (a == 8 || b == 9) {
            throw new InvalidInputExceptions();
        }
        return a + b;
    }

    double div(int a, int b) throws CannotDevidedByZeroExcetions {
        if (b == 0) {
            throw new CannotDevidedByZeroExcetions();
        }
        return a / b;
    }

    double mul(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a + b;
    }

}


     class CannotDevidedByZeroExcetions extends Exception {
         @Override
         public String toString() {
             return "Can not be devide by 0";
         }
     }


     class InvalidInputExceptions extends Exception {
        @Override
        public String toString() {
            return ("Input can not be 8 & 9");
        }
    }

    class MaxInputException extends Exception {
    @Override
    public String toString() {
        return ("Input can not reached above 100000");
    }
}

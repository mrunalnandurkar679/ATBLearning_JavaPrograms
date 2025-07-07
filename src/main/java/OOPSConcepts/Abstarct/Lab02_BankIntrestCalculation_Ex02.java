    package OOPSConcepts.Abstarct;

public class Lab02_BankIntrestCalculation_Ex02 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getInterestRate();

        HDFC hdfc = new HDFC();
        hdfc.getInterestRate();
          }
}

abstract class RBIBank{
    RBIBank()
    {
        System.out.println("RBI is the main Bank of India");
    }
   abstract void getInterestRate();

   void Reporate()
   {
       System.out.println("RBI has repo rate 6% for all");
   }
}
class SBI extends RBIBank{
    @Override
    void getInterestRate() {
        System.out.println("SBK+I Bank rate of intrest is 6.5%");
    }
}
class HDFC extends RBIBank
{

    @Override
    void getInterestRate() {
        System.out.println("HDFC has intrest 7.0%" );
    }
}
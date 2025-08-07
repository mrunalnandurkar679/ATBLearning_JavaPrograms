package Assasement_Java;

public class Bank_Account_Encapsulation {
    private double balance ;

    public static void main(String[] args) {
        Bank_Account_Encapsulation bank = new Bank_Account_Encapsulation();
        bank.initital_balance(50000);
        bank.withdrawal(40000);
        bank.deposite(20000);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void initital_balance(double amount)
    {
        if(amount<0)
        {
            throw new IllegalArgumentException("initial balance can not be negative");
        }
        this.balance = amount;

        System.out.println("initial amont is " +this.balance);
    }

    void deposite(double amount)
    {
        if(amount <=0)
        {
            throw new IllegalArgumentException("Amount can not be deposite ");
        }
        this.balance+= amount;
        System.out.println("amount after deposite " +this.balance);
    }

    void withdrawal(double amount)
    {
        if (amount<=0)
        {
            throw new IllegalArgumentException("WIthdrawal amount can not be less than 0");
        }
        if (amount> this.balance )
        {
            throw new IllegalArgumentException("Withdrwala amount cannot be more than initial balance");
        }
        this.balance-= amount;
        System.out.println("amount after withdrawal " +this.balance);

    }

    public double getBalance()
    {
        return balance;
    }
}

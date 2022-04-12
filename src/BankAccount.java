import java.util.Scanner;

public class BankAccount {

    public double withdraw;
    public double deposit;
    public double balance;

    Scanner scanner = new Scanner(System.in);

    public BankAccount(double balance)
    {
        this.balance = balance;
    }


    public void getWithdraw()
    {
        System.out.println("How much money do you want to withdraw?");
        withdraw = scanner.nextDouble();
        balance -= withdraw;
        System.out.println("Now you balance is " + balance);
    }


   public void getDeposit()
   {
       System.out.println("How much money do you want to deposit?");
       deposit = scanner.nextDouble();
       balance += deposit;
       System.out.println("Now you balance is " + balance);
   }
   public void getBalance()
   {
       System.out.println("Now you balance is " + balance);
   }

}



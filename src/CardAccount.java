import java.util.Scanner;

public class CardAccount extends BankAccount
{
    public CardAccount(double balance)
    {
        super(balance);
    }

    Scanner scanner = new Scanner(System.in);
    public void getWithdraw()
    {
        System.out.println("How much money do you want to withdraw?");
        withdraw = scanner.nextDouble();
        if ((withdraw + (withdraw * 0.01) > balance))
        {
            System.out.println("You don't have enough money! Take a loan!");
        }
        else {
            balance -= (withdraw + (withdraw * 0.01));
            System.out.println("Now you balance is " + balance);
        }
    }
}

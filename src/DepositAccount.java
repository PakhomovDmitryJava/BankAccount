import java.util.Calendar;
import java.util.Date;

public class DepositAccount extends BankAccount
{
    float firstDepositTime;
    float firstWithdrawTime;

    public DepositAccount(double balance)
    {
        super(balance);
    }



    @Override
    public void getDeposit() {
        System.out.println("How much money do you want to deposit?");
        deposit = scanner.nextDouble();
        balance += deposit;
        System.out.println("Now you balance is " + balance);
        firstDepositTime = System.currentTimeMillis();
    }

    @Override
    public void getWithdraw()
    {
        firstWithdrawTime = System.currentTimeMillis();
        if ((firstWithdrawTime - firstDepositTime) < 2592000000L)
        {
            System.out.println("You can't get a withdraw! You have to wait 1 month.");
        }
        else
        {
            System.out.println("How much money do you want to withdraw?");
            withdraw = scanner.nextDouble();
            balance += withdraw;
            System.out.println("Now you balance is " + balance);
        }




    }
}





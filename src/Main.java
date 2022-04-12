public class Main {
    public static void main(String[] args)
    {
      BankAccount bankAccount = new BankAccount(15000);
      CardAccount cardAccount = new CardAccount(15000);
      DepositAccount depositAccount = new DepositAccount(15000);

      bankAccount.getWithdraw();
      bankAccount.getDeposit();
      bankAccount.getBalance();
      cardAccount.getWithdraw();
      depositAccount.getDeposit();
      depositAccount.getWithdraw();
    }
}





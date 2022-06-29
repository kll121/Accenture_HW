public class Main {
    public static void main(String[] args) {
    BankAccount firstAccount = new BankAccount(1222);
    BankAccount secondAccount = new BankAccount(999);

    firstAccount.withdraw(1223);
    secondAccount.deposit(5002);
    firstAccount.transferBalance(secondAccount, 1500);
    }
}
/*3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another
 * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible*/
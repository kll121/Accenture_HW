public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        this.balance = balance;
        return balance;
    }
    public void setBalance(){
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount >= 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit: " + amount);
        }
        if (amount < 5000 && amount >0 ) {
            System.out.println("You've deposited this amount: " + amount);
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if(amount > balance){
            System.out.println("There is not enough funds.");
        }
        if(amount < balance && amount > 0){
            System.out.println("You've withdrawn this amount: " + amount);
            balance -= amount;
        }
    }
    public void printBalance(){
        System.out.println(balance);
    }
    public void transferBalance (BankAccount otherBankAccount, double amount){
        if (amount > this.balance){
            System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + this.balance + " are available.");
        }
        if(this.balance > amount && this.balance > 0) {
            otherBankAccount.balance += amount;
            this.balance -= amount;
            System.out.println("You have successfully transferred " + amount);
        }
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
4)4) update your solution:
        * Encapsulate the balance property so it is private
        * add to "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exialidation tsts in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
                For example, if bank account A has 50 units and bank account B has 25 units
                and we try to transfer 30 units from B to A, then it should output:
                    "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
        * add a limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible*/

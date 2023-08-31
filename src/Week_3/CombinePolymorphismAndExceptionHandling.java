package Week_3;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);  }
}
abstract class BankAccount{
    double balance;
    abstract void deposit(double amount) throws IllegalArgumentException;
    abstract void withdraw(double amount) throws InsufficientFundsException,IllegalArgumentException;
}
class CheckingAccount extends BankAccount{
    void deposit(double amount) throws IllegalArgumentException {
        if(amount<0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }else{
            balance +=amount;
            System.out.println("Deposit Balance: " + balance);}
    }

    void withdraw(double amount) throws InsufficientFundsException,IllegalArgumentException {
        if (amount<0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if (amount>balance) {
            throw new InsufficientFundsException("Insufficient funds.");}
        else {
            balance -=amount;
            System.out.println("After withdraw Balance: " + balance);}
    }
    }
class CombinePolymorphismAndExceptionHandling{
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        try {
            checkingAccount.deposit(1000);
            checkingAccount.withdraw(7000);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); }
    }
}




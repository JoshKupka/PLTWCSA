
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    public double balance;
    public String name;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(String n, double bal)
    {   
        name = n;
        balance = bal;
    }
    
    public void deposit(double insert)
    {
        balance += insert;
    }
    
    public void withdraw(double remove)
    {
        balance -= remove;
    }
}

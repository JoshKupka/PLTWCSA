

/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.text.*;

public class Tester 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Tester
     */

    public static void main()
    {
        BankAccount myAccount = new BankAccount("Sally Jones" , 1000);

        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);

        myAccount.withdraw(100);

        System.out.println("The " + myAccount.name + " account balance is " + myAccount.balance + ".");

        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(2);
        fmt.setMaximumFractionDigits(2);
        String name;
        //Instantiate an ArrayList here called accounts
        List accounts = Collections.synchronizedList(new ArrayList());
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
            name = kbReader.nextLine();

            if (!name.equalsIgnoreCase("EXIT"))
            {
                System.out.print("Please enter the amount of the deposit");
                double amount = kbReader.nextDouble();
                System.out.println(" ");//gives an eye-pleasing blank line
                //Create a BankAccount object here
                BankAccount ba = new BankAccount(name,amount);
                //Add it to the ArrayList object
                accounts.add(ba);
            }
        }while(!name.equalsIgnoreCase("EXIT"));

        //Search accountList and print out the name and amount of the largest bank account
        BankAccount ba = (BankAccount)accounts.get(0);//get the first account in the list
        double maxBalance = ba.balance;
        String maxName = ba.name;
        for (int j = 1; j < accounts.size(); j ++)
        {
            /*Write code here to step through the remaining objects and decide which one has largest balance (compare each balance to maxBalance)*/
            ba = (BankAccount)accounts.get(j);
            if(ba.balance > maxBalance){
                maxBalance = ba.balance;
                maxName = ba.name;
            }
        }
        //print answer here
        System.out.println("The account with the largest balance belongs to " + maxName);
        System.out.println(maxBalance);
    }
}

/*
 ID:21CE103
 NAME:SMIT PATEL
  REPOSITORY LINK:https://github.com/Smit103/21CE103_PRAC1_PART2.git
 AIM:(Subclasses  of  Account)  In  Programming  Exercise  2, 
the  Account  class  wasdefined to model a bank account. 
An account has the properties account number,balance,  
annual  interestrate,  and  date  created,  and  methods
to  deposit  and withdrawfunds.  Create  two  subclasses 
 for  checking  and  saving  accounts.  A checkingaccount
 has  an  overdraft  limit,  but  a  savings  account  cannot 
be overdrawn.Draw  the  UML  diagram  for  the  classes  and  
then implement  them. Writea  test  program  that  creates  objects
of  Account,  SavingsAccount,  andCheckingAccount and invokes their 
toString() methods.
 */
import java.sql.Date;

public class Acc4 {
    private int id;
    private double balance;
    private static double annualIR;
    private Date dateCreated;

    Acc4() {
        this(0, 0); 
    }
    Acc4(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualIR = 0;
        dateCreated = new Date(id);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualIR(double annualInterestRate) {
        Acc4.annualIR = annualInterestRate;
    }


    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    public double getAnnualIR() {
        return annualIR;
    }
    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMIR() {
        return annualIR / 12;
    }
    public double getMI() {
        return balance * (getMIR() / 100);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
            + "\nBalance: $" + String.format("%.2f", balance) + 
            "\nMonthly interest: $" + String.format("%.2f", getMI());
    }
    public void moneytransfer(Acc4 account, double tranbal) {
    }
}
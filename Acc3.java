/*
ID:21CE103
NAME;SMIT PATEL
 REPOSITORY LINK:https://github.com/Smit103/21CE103_PRAC1_PART2.git
Use the Account class created as above to simulate an ATM machine.
Create 10 accounts  with id AC001.....AC010  with  initial balance 300₹. 
The system prompts the users to enter an id. If the id is entered incorrectly, 
ask the  user  to  enter  a  correct  id.  Once  an  id  is  accepted,  display  menu  with multiple choices. 
1.Balance inquiry
2.Withdraw money [Maintain minimum balance 300₹]
3.Deposit money
4.Money Transfer
5.Create Account
6.Deactivate Account
7.Exit 
 */
import java.util.Date;

public class Acc3 {
    private int id=0;
    private double balance=500;
    private double annualIR=7;
    private Date dateCreated= new Date();
    Acc3() {}

    Acc3(int id)
    {
        this.id = id;
    }

    Acc3(int id, double balance)
    {
        this(id);
        this.balance= balance;
    }

    Acc3(int id, double balance, double annualIR, Date dateCreated)
    {
        this(id, balance);
        this.annualIR = annualIR;
        this.dateCreated = dateCreated;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualIR = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualIR() {
        return annualIR;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMIR()
    {
        return annualIR/12;
    }

    public double getMI()
    {
        return balance*(annualIR/1200);
    }

    public double withdraw(double a)
    {
        balance-=a;
        return balance;
    } 

    public double deposit(double a)
    {
        balance+=a;
        return balance;
    }

    public void moneytransfer(Acc4 Ac,double a)
    {
        withdraw(a);
        Ac.deposit(a);
    }

    @Override
    public String toString() {
        return "The Account number is " + getId() + "\nThe balance in the Account is " + getBalance() + "\nThe anuuual intersect rate is " + getAnnualIR() + "\nThe data of creation of the account is " + getDateCreated();
    }
}
    
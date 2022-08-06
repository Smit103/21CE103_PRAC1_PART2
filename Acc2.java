/*
 ID:21CE103
 NAME:SMIT PATEL
  REPOSITORY LINK:https://github.com/Smit103/21CE103_PRAC1_PART2.git
 AIM:Design a class named Account that contains:
 •A private int data field namedid for the account (default 0).
 •A private double data field named balance for the account (default 500₹).
 •A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%).Assume all accounts have the same interest rate.
  •A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
  •A no-arg constructor that creates a default account.
  •A constructor that creates an account with the specified id and initial balance.
  •The accessor and mutator methods for id, balance, and annualInterestRate.
  •The accessor method for dateCreated.
  •A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
  •A method named getMonthlyInterest() that returns the monthly interest.
  •A method named withdraw that withdraws a specified amount from theaccount.
  •A method named deposit that deposits aspecified amount to the account.
 */
import java.util.Date;

public class Acc2{

    private int id=0;
    private double balance=500;
    private double annualIR=7;
    private Date dateCreated= new Date();
    Acc2(){}
    public double getAnnualInterestRate() {
        return annualIR;
    }
    public void setAnnualInterestRate(double annualIR) {
        this.annualIR = annualIR;
    }
    public int  setDateCreated() {
        return setDateCreated();
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    Acc2(int a,double b,double c){
        id=a;
        balance=b;
        annualIR=c;
    }
    Acc2(Date x){
        dateCreated=x;
    }

    public Date AccDate(){
        return dateCreated;
    }

    public void getMIR(){
        
        double m_IR;
        m_IR=annualIR;

        System.out.println("The Monthly Interest Rate is "+m_IR/(12));
    }

    public void getMI(){
        double m=annualIR;
        double  b2=balance;
        double min=(m/(100*12));
        b2=b2*min;
        System.out.println("The Monthly Interest is "+b2);
    }

    public void withdraw(double a){
        double b1=balance;
        b1=b1-a;
        System.out.println("Withdraw amount :"+a);
        System.out.println("After withdraw remaining balance:"+b1);
    }
   public void  deposit(double b){
    double b2=balance;
       b2=b2+b;
       System.out.println("After Depocit balance: "+b2);
   }
}
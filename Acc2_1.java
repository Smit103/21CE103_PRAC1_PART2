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
public class Acc2_1 {
    public static void main(String[] args) {
        Acc2 c1=new Acc2(103,103,3);
        c1.getMIR();;
        c1.getMI();
        c1.deposit(250);
        c1.withdraw(100);
        c1.AccDate();
        System.out.println(c1.AccDate());
    } 
 }
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
public class Acc4_saving
 		extends Acc4 {

 	public Acc4_saving() {
 		super();
 	}

 	public Acc4_saving(int id, double balance) {
 		super(id, balance);
 	}

 	public void withdraw(double amount) {
 		if (amount < getBalance()) {
 			setBalance(getBalance() - amount);
 		}
 		else
 			System.out.println("Error! Savings account overdrawn transtaction rejected");
 	}
}
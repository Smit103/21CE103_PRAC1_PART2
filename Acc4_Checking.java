
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
public class Acc4_Checking
 		extends Acc4 {
 	private double draftLimit;

 	public Acc4_Checking() {
 		super();
 		draftLimit = -20;
 	}
 	public Acc4_Checking(int id, double balance, double draftLimit) {
 		super(id, balance);
 		this.draftLimit = draftLimit;
 	}

 	public void setOverdraftLimit(double overdraftLimit) {
 		this.draftLimit = overdraftLimit;
 	}

 	public double getOverdraftLimit() {
 		return draftLimit;
 	}

 	public void withdraw(double amount) {
 		if (getBalance() - amount >  draftLimit) {
 			setBalance(getBalance() - amount);
 		}
 		else
 			System.out.println("Error! Amount exceeds overdraft limit.");
 	}

 	public String toString() {
 		return super.toString() + "\nOverdraft limit: $" + 
 		String.format("%.2f", draftLimit);
 	}
}
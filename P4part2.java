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
public class P4part2 {
   
        public static void main(String[] args) {

            Acc4 account = new Acc4(103, 50000);
            Acc4_saving savings = new Acc4_saving(104, 30000);
            Acc4_Checking checking = new Acc4_Checking(105, 40000, -50);

            account.setAnnualIR(6.5);
            savings.setAnnualIR(6.5);
            checking.setAnnualIR(6.5);
            account.withdraw(1500);
            savings.withdraw(100);
            checking.withdraw(500);
            account.deposit(6000);
            savings.deposit(4000);
            checking.deposit(7000);

            System.out.println(account.toString());
            System.out.println(savings.toString());
            System.out.println(checking.toString());
        }
    }



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
import java.util.ArrayList;
import java.util.Scanner;

public class Acc3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        Acc4[] account = new Acc4[10];
        for(int i=0;i<10;i++){
            account[i] = new Acc4();
        }
        ArrayList<Acc4> Ac = new ArrayList<Acc4>();
        for(int i=0;i<10;i++)
        {
            Ac.add(account[i]);
        }
        for(int i=0;i<10;i++)
        {
            Ac.get(i).setId(i+1);
        }
        if(Ac.isEmpty())
            System.out.println("Arraylist is empty,.");
        do{
        System.out.print("\nEnter the id: ");
        int a = sc.nextInt();
        for(int i=0;i<Ac.size();i++)
        {
            if(Ac.get(i).getId()==a)
            {
                System.out.print("Enter 1 for Balance Inquiry\n2 for Withdraw money\n3 for Deposit money\n4 for Money Transfer\n5 for Create account\n6 for Deactivate Account\n7 for exit\nEnter the number: ");
                int y = sc.nextInt();
                switch(y)
                {
                    case 1:
                        System.out.println("Current Balance is "+Ac.get(i).getBalance());
                        break;
                    case 2:
                        System.out.print("Enter the amount of money you want to withdraw ");
                        double withbal = sc.nextDouble();
                        if(Ac.get(i).getBalance()-withbal>=300)
                            Ac.get(i).withdraw(withbal);
                        else
                            System.out.println("Insufficient Balance");
                        System.out.println("After withdrawal the balance is "+Ac.get(i).getBalance());
                        break;
                    case 3:
                        System.out.print("Enter the amount of money you want to deposit");
                        double depbal = sc.nextDouble();
                        Ac.get(i).deposit(depbal);
                        System.out.println("After deposit the balance is "+Ac.get(i).getBalance());
                        break;
                    case 4:
                        System.out.print("Enter the Account ID number in which you want to transfer: ");
                        int acid = sc.nextInt();
                        System.out.print("Enter the amount of money you want to transfer ");
                        double tranbal = sc.nextDouble();
                        Ac.get(i).moneytransfer(Ac.get(acid-1), tranbal);
                        System.out.println("After transfer the balance in first account is "+Ac.get(i).getBalance());
                        System.out.println("After transfer the balance in second accountis "+Ac.get(acid-1).getBalance());

                        break;
                    case 5:
                        Acc4 ACC = new Acc4();
                        Ac.add(ACC);
                        System.out.println("Account is created by the ID " + Ac.size());
                        break;
                    case 6:
                        int oldid = Ac.get(i).getId();
                        Ac.remove(i);
                        System.out.println("The account with ID "+oldid+" is deactivated");
                        break;
                    case 7:
                        b = 1;
                        break;
                }
                break;
            }
        }
    }while(b!=1);
    }
}
package bank_account;

import java.util.Scanner;

public class AccountTester {
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the balance--");
	int initialBalance=sc.nextInt();
	AccountClass ac=new AccountClass(initialBalance);
	Runnable r1=new Runnable()
			{
		      public void run()
		      {
		    	  System.out.print("Enter the amount to deposit--");
					int depositAmount=sc.nextInt();sc.nextLine();
					ac.deposit(depositAmount);
					System.out.println("Amount Deposited is :"+depositAmount +" \nAvailable Balance is :"+ac.getBalance());
					
		      }
			};
	Runnable r2=new Runnable()
			{
		      public void run()
		      {
		    	  System.out.print("Enter the amount to withdraw--");
					int withdrawAmount=sc.nextInt();sc.nextLine();
					if(ac.balance>withdrawAmount)
					{
					ac.withdraw(withdrawAmount);
					System.out.println("Amount withdrawn is :"+withdrawAmount +"\n Available Balance is :"+ac.getBalance());
					}
					else
					{
						System.out.print("Please enter amount less than balance:");
						
					}
		      }
			};
			
			
			String option="yes";
			while(option.startsWith("Y")||option.startsWith("y"))
			{
				Thread t1=new Thread(r1,"DepositServer");
				Thread t2=new Thread(r2,"WithdrawServer");
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				System.out.print("Do you want to continue Press Yes/No--");
				option=sc.nextLine();
			}
			
			
			
}
}

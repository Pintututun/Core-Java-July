package bank_account;

public class AccountClass {
int balance;

public AccountClass(int balance) {
	super();
	this.balance = balance;
}
public void deposit(int amount)
{
	balance=balance+amount;
	

}
public void withdraw(int amount)
{
	balance=balance-amount;
	
}
protected int getBalance() {
	return balance;
}
protected void setBalance(int balance) {
	this.balance = balance;
}

}

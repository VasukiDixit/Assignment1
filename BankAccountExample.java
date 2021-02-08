package Assignment3;
class SavingsAccount{
	int balance;
	int interest;
	public char[] getBalance;
	public char[] getWithdraw;
	public SavingsAccount(int balance, int interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	public int getBalance() {
		return balance;
	}
	void withdraw(int amount) {
	
		balance=balance-amount;
	}
   void deposit(int amount) {
	   balance=balance+amount;
   }
void addInterest() {
	int inte=balance*(interest/100);
}
public void getWithdraw(int amount) {
	balance=balance-amount;
	
}
}
public class BankAccountExample {
 public static void main(String[] args) {
	 
	 SavingsAccount sa=new SavingsAccount(3000,4);
	 sa.getBalance();
	 sa.deposit(1000);
	 sa.withdraw(500);
	 sa.getWithdraw(1000);
	 
	 
 }
}

/**
 * Author: Chloee Stephenson
 * Date: 10-2-19
 * Description: Account class
 */
public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double withdraw = 0.0;
	private double deposit = 0.0;
	Account() {
		id = 0;
		balance = 100;
	}
	Account(int newid, double newbalance){
		id = newid;
		balance = newbalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void withdraw(double withdraw) {
		if (withdraw > this.balance) {
		}
		else {
			balance -= withdraw;
		}
	}
	public void deposit(double deposit) {
		balance += deposit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
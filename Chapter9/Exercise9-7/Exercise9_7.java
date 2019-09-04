/** 
 * Author: Chloee Stephenson 
 * Date: 8/30/19
 * Description: Uses the Account class to show account number, account balance, 
 * monthly interest and implements withdraw and deposit methods
 */

public class Exercise9_7 {
	public static void main(String[] args) {
		 
		Account a1 = new Account(1122,20000.00);
		
			a1.withdraw(2500);
			a1.deposit(3000);
			a1.setAnnualInterestRate(0.045);
		
			System.out.println("The account Id is: " + a1.getId());
			System.out.println("The balance is: $" + a1.getBalance());
			System.out.println("The monthly interest is: $" + a1.getMonthlyInterest());
			System.out.println("The account was created on: " + a1.getDate());
		
	}
}


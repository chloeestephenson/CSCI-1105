/**
 * Author: Chloee Stephenson
 * Date: 10-2-19
 * Description: ATM Machine with the Account class
 */
import java.util.Scanner;

public class Exercise10_7 {
	static Scanner input = new Scanner(System.in);
	static Account a1[] = new Account[10];
	static int i = 1;
	static int z = 1;

	public static void main(String args[]){
		for(int a = 0; a < a1.length; a++) {
			a1[a] = new Account(a, 100);
		}

		do {
			System.out.println("Enter an id number between 0 and 9: ");
			int id = input.nextInt(); 

			if(id >= 0 && id <= 9) {


				do {
					z = 1;
					System.out.println("Main Menu");
					System.out.println("---------");
					System.out.println("Enter 1 to check balance");
					System.out.println("Enter 2 to withdraw");
					System.out.println("Enter 3 to deposit");
					System.out.println("Enter 4 to exit to logout");
					int choice = input.nextInt();

					//This is the beginning of the choice statements
					if(choice == 1) {
						System.out.println("The current balance is: " + a1[id].getBalance());	
					}
					else if(choice == 2) {
						System.out.println("Enter an amount to withdraw: ");
						int wit =input.nextInt();
						a1[id].withdraw(wit);
						System.out.println("Withdraw Complete");
						System.out.println("");
					}
					else if(choice == 3){
						System.out.println("Enter an amount to deposit: ");
						int dep =input.nextInt();
						a1[id].deposit(dep);
						System.out.println("Deposit Complete");
						System.out.println("");
					}
					else if(choice == 4) {
						z = 0;
					}
					else {
						System.out.println("Not a valid option. Please try again");
					}
				}while(z != 0);

				//This is the end of the choice statements
			}
			else { 
				System.out.println("Please enter a valid Id number");				
			}
		}while (i != 0);



	}		
}


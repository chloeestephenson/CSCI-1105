/**
 * Author: Chloee Stephenson
 * Date: 10-2-19
 * Description: ATM Machine with the Account class
 */
import java.util.Scanner;

public class Exercise10_7 {
	private static Scanner input;
	static int i = 1;
	static int z = 1;
	public static void main(String args[]){
		input = new Scanner(System.in); 
		do {
			System.out.println("Enter an id number between 0 and 9: ");
			int id = input.nextInt();
				
				if(id >= 0 && id <= 9) {
					
						Account a1 = new Account( id, 100.0);
					  do {
						  z = 1;
						System.out.println("Main Menu");
						System.out.println("---------");
						System.out.println("Enter 1 to check balance");
						System.out.println("Enter 2 to withdraw");
						System.out.println("Enter 3 to deposit");
						System.out.println("Enter 4 to exit to logout");
						int choice = input.nextInt();
						//This is the beginning of the if choice != 4
							
								//This is the beginning of the choice statements
								if(choice == 1) {
									System.out.println("The current balance is: " + a1.getBalance());	
								}
								else if(choice == 2) {
									System.out.println("Enter an amount to withdraw: ");
									int wit =input.nextInt();
									a1.withdraw(wit);
								}
								else if(choice == 3){
									System.out.println("Enter an amount to deposit: ");
									int dep =input.nextInt();
									a1.deposit(dep);
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


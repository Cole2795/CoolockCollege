/**
 * @(#)OOPAssignment.java
 *
 *
 * @author
 * @version 1.00 2015/11/5
 */
import java.io.*;
import java.util.*;
public class BankStatement{
	static Scanner kbReader = new Scanner(System.in);
	static String name[]= {"Keith", "Paul", "Sarah"};
	static int pin[]= {1234, 4567, 5678};
	static int balance[]= {400, 200, 100};
	static int overdraft[]= {1, 0, 0};
	static int position=0;
	static int found =0;
	static int choice = 0;

    public static void main(String args[]) {
		//method class
		login();

    }//end main method

    public static void login(){

	String Strgrade;
	//int found =0, position =0;
	System.out.println("Welcome to Bank System");
	System.out.println("Please choose an option");
	System.out.println("1. Login");
	System.out.println("2. Quit");
	int ch = kbReader.nextInt();
	switch(ch){
		case 1:
			System.out.println("Please enter your pin");
			int Pin = kbReader.nextInt();
			for(int i =0; i<pin.length; i++){
				if(Pin ==pin[i]){
					found = 1;
					position = i;
				}//end if
			}//end loop
		valid();
		case 2:
			if(found == 0){
				//System.out.println("Wrong details");
				System.out.println("Thank you for using the Bank System");
				System.exit(0);
			//validation();
			}//end if
		//valid();

	}//end switch case
    }//end login

    public static void valid(){

		System.out.println("Welcome " + name[position] + "\nYou have " + balance[position] + "\nOverdraft facility " + overdraft[position]);
		menu();

    }//end valid
   /* public static void validation{

    }//end validation*/

  public static void menu(){
			//int choice = 0;
			while(choice != 4){
				System.out.println("\n");
				System.out.println("1. Lodge");
				System.out.println("2. Withdraw");
				System.out.println("3. Change pin");
				System.out.println("4. Quit");
				//take the users choice 1-4
				System.out.println("Enter choice : ");
				choice = kbReader.nextInt();
				if(choice == 1){
					System.out.println("\n");
					System.out.println(name[position] + "\nYou have " + balance[position]);
					System.out.println("Enter your balance :");
					int balances = kbReader.nextInt();
					lodge(balances);
				}//end if
				else if(choice ==2){
					System.out.println("\n");
					System.out.println(name[position] + "\nYou have " + balance[position]);
					System.out.println("Enter amount to withdraw : ");
					int bal = kbReader.nextInt();
					withdraw(bal);
				}//end if 2
				/*else if(choice ==3){
					System.out.println("Please your pin");
					int Pin = kbReader.nextInt();
					while(!pin[i].matches("\\d+")){
						for(int i =0; i<pin.length; i++){
							if(Pin ==pin[i]){
								found = 1;
								position = i;
							}//end if
						else if(found == 0){
							System.out.println("Wrong details");
						}//end if
						}//end loop
					}//end while
					changepin(Pins);
			}//end if 3*/
			else if(choice == 4){
				exit();
				//System.out.println("Thank you  for using the Bank System");
			}//end if 4
			else{
				System.out.println("No number from menu, Only 1 to 4");
			}
		}//end while

  }//end menu
  public static void lodge(int mbalances){

	System.out.println("\n");
	System.out.println(balance[position] = balance[position] + mbalances);
	System.out.println(name[position] + "\nYour balance is now : " + balance[position] + "\nOverdraft facility " + overdraft[position]);


  }//end lodge
  public static void withdraw(int mbal){

	System.out.println("\n");
	System.out.println(balance[position] = balance[position] - mbal);
	System.out.println("\n");
	System.out.println(name[position] + "\nYour balance is now : " + balance[position] + "\nOverdraft facility " + overdraft[position]);
  }//end withdraw
 /* public static void changepin(int mPins){

	System.out.println("Please enter new pin");
	mPins = kbReader.nextInt();
	System.out.println(name[position] + "\nnew pin : " + Pin + "\nYour balance is " + balance[position] + "\nOverdraft facility " + overdraft[position]);

  }//end changepin*/
    public static void exit(){

	//System.out.println("Thank you  for using the Bank System");
	login();

  }//end exit

}//end class
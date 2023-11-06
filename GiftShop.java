/**
 * @(#)Assignment.java
 *Nicole Campbell
 *
 *
 * @author
 * @version 1.00 2015/9/16
 */
import java.io.*;
import java.util.*;

public class GiftShop{
	//main method
    public static void main (String args [])
    {


    	int pincode[]= {1234,2345,3456,4567,5678};
    	String memeber[] = {"Peter","John","Paul","Mary","Pat"};
    	int points[] = {250,3000,110,2000,450};
    	int giftpoints[] = {100,1200,350,500,700};
    	String gifts[] = {"Toaster", "Bike", "ipod", "Phone", "ipad"};
    	int found =0, position =0, sum =0, point;
    	Scanner kbReader = new Scanner(System.in);
    	System.out.println("Welcome to The Gift Shop."); //print out welcome to shop in command prompt
    	System.out.println("Please choose an optain from the following menu."); //have choose one
    	System.out.println("1.Log in"); //log in mean enter what you pincode and add points
    	System.out.println("2.Exit"); //exit to finish
    	int ch =kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
    	switch(ch) //switch statement and choice one
    	{//start switch
    		case 1:
    				//NO NEED TO TAKE IN THE NAME
    				//System.out.println("Please enter your username");
    				//String user = kbReader.nextLine();
    				System.out.println("Please enter your pincode\n"); //enter pincode number
    				int Pincode = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
    				for(int i =0; i<pincode.length; i++)	//for loop
    				{//start loop
    					if(Pincode ==pincode[i]) //if statement
    					{//start if
    						found = 1;
    						position = i;	//hold onto the position in the array that the user is stored
    					}//end if
    				}//end loop
			case 2:
    				if(found == 0){
    				System.out.println("Wrong details"); //when enter pinccode if make mistake pincode number will tell you wrong details
    				System.out.println("\nThank you for using the Supermarket System\n\n");
    				System.exit(0); //exit to finish
    				}//end if found == 0


    	}//end switch case


		//IF A CORRECT PIN IS ENTERED WE NEED TO DISPLAY THE PERSONS DETAIL
		//IF a correct pin is entered tell you who name is
		System.out.println("\n");
		System.out.println("Welcome " + memeber[position] + " You have " + points[position] + " points");
		//NOW DISPLAY THE MENU
			//System.out.println("Please choose an option"); //any choose from menu

		int choice = 0;	//chioice = the menu choice (1-5)

		//while loop to keep the loop executing
		while (choice != 5){ //use while loop keep going with menu option from 1 to 5 and choice 5 mean exit to finish
			System.out.println("\n");
			System.out.println("1. View Gifts"); //show gift and giftpoints from arrays
			System.out.println("2. Buy Gifts"); //buy what you want
			System.out.println("3. Add points"); //add point from giftpoints
			System.out.println("4. Change pin"); //change pin number
			System.out.println("5. Exit"); //exit to finish
			//take the users choice 1-5
			System.out.println("\n");
			System.out.print("Enter choice : "); //pick any number from 1 to 5 from menu options
			//take input from user
			choice = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer

			//take the persons input (choice)
			if (choice == 1){ //start if
				//display the gifts

				gifts[0] = "Toaster";
				gifts[1] = "Bike";
				gifts[2] = "ipod";
				gifts[3] = "Phone";
				gifts[4] = "ipad";
				/*giftpoints [] = new double [] { 100, 1200, 350, 500, 700};*/
				System.out.println("gifts \t\t giftpoints"); //tabs keep space not together
					for ( int j = 0; j < gifts.length; j++ ) //  for loop
					{ //start loop
					//System.out.println("\n");
					System.out.println(gifts[j] + "\t\t" + giftpoints[j]); // computer is printout in Command prompt from gift and gift points
					} //end loop
			} //end if

			else if (choice ==2){ //start if
				System.out.println("\n");
				System.out.println("Enter the number of the gift you want to purchase: "); //enter number what you want
				//take an int input (giftnum)
				int giftnum =5; //int input
				giftnum = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
				if (points[position] >= giftpoints[giftnum -1]) //if start
				{
							points[position] = points[position] - giftpoints[giftnum -1];//when you pick any number what gift you want show up the command prompt but array us 4 but 5 is giftnum but use -1
							System.out.println("Item bought\n"); //printout Item bought
							System.out.println(gifts[position] + " purchased");
							System.out.println("Points remaining : 150");
				}
				else
				{
						System.out.println("Not enough points"); //enter any number tell not enough points
				}

				/*int i=0;
				if(i<1)
				{
					;
				}*/
				}//end else if 2
				else if(choice ==3){
					//add point
					System.out.println("\n");
					System.out.println("\nHow many point did you get"); //any number you want to add
					point = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
					points[position] = points[position] + point;
					sum = sum + 10; //add up
					System.out.println(points[position] = points[position] + point); //any number then add up to giftpoint


				}//end else if 3
				else if(choice ==4){
					//change pin
					System.out.println("please enter pin ");

					/*System.out.println("\n");//new line
					System.out.println("Change pin");
					System.out.println("Please enter new pin with 4 digits"); //enter new pin
					int newpin = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
					System.out.println(memeber[position] + " You have new pin number is: " + newpin); //name of member and got new pin number*/

				}//end else if 4

		}//end while

		System.out.println("\nThank you for using the Supermarket System\n\n");
	

    }//end method

}//end class


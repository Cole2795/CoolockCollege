/*Nicole Campbell
5/9/15
This program uses grade */
import java.io.*; //inputting integers, doubles and Strings
import java.util.*;
public class LeavingCertResult
{
	public static void main (String args []) //main method
	{ //open curley bracket

			int agrade, ahighest = 0, alowest = 101, aaverage = 0, atotal = 0; //uses int a for grade, high, low, average and total for first student use while loop
			int bgrade, bhighest = 0, blowest = 101, baverage = 0, btotal = 0; // use int b for grade, high, low, average and total for second student use for loop
			Scanner kbReader = new Scanner(System.in); //input from keyboard if use int, double or String mean link program to this method to pick up the value in the keyboard and out it into from any three data types.
			System.out.println("Please enter name of the first student"); //computer prinout in command prompt to enter first student
			String student = kbReader.nextLine(); //String mean link program to this method to pick up the value the keyboard and put it into from String.
			System.out.println("Welcome, you enter " +  student); //when enter name so printout in command prompt sau "welcome, you enter" and put name on it what have you type up say enter first student
			int number; //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
			number = 1; //start number 1 to 7 from 7 subjects
			int Student = 7; //number 7 will stop at end when finish grade
			int grade[] = new int[Student]; //array list of grade and student mean up to int student = 7
			while ( number < 8) //while loop 
			{ //open curley bracket

			
				System.out.println("Enter grade"); //enter grade pick anything number
				agrade = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
				if(agrade <=40) //use if statement from number to any number and printout System.out.println see which one get mark for that
				{
					System.out.println("D3 Scores: 40 points"); //see what points did you get
				}
				else if(agrade <=45)
				{
		 			System.out.println("D2 Scores: 45 points"); //see what points did you get
				}
				else if(agrade <=50)
				{
					System.out.println("D1 Scores: 50 points"); //see what points did you get
				}
				else if(agrade <=55)
				{
					System.out.println("C3 Scores: 55 points"); //see what points did you get
				}
				else if(agrade <=60)
				{
					System.out.println("C2 Scores: 60 points"); //see what points did you get
				}
				else if(agrade <=65)
				{
					System.out.println("C1 Scores: 65 points"); //see what points did you get
				}
				else if(agrade <=70)
				{
					System.out.println("B3 Scores: 70 points"); //see what points did you get
				}
				else if(agrade <=75)
				{
					System.out.println("B2 Scores: 75 points"); //see what points did you get
				}
				else if(agrade <=80)
				{
					System.out.println("B1 Scores: 80 points"); //see what points did you get
				}
				else if(agrade <=90)
				{
					System.out.println("A2 Scores: 90 points"); //see what points did you get
				}	
				else if(agrade <=100)
				{
					System.out.println("A1 Scores: 100 points"); //see what points did you get
				}
				/*
				ahighest =  ahighest + agrade; //add agrade to ahighest
				alowest =  alowest + agrade;  //add agrade to alowest
				aaverage = aaverage + agrade/7; //add agrade to aaverage
				*/
				atotal = atotal + agrade; //add agrade to total
		
				if(agrade <=40) //if statment to see if the agrade is less than alowest
				{
					alowest = agrade; //look for lowest point not highest points
				}
				else if(agrade >=50) //if statement to see if agrade is higher than ahighest
				{
					ahighest = agrade; //look for high point not lowest points
				}
				number = number + 1;
				
				if(agrade >=41) //average to divde 7 use 6 subject
				{
					aaverage = aaverage + agrade/7; // divide 7
				}
		} //end while loop
			System.out.println("\n"); //new line
			System.out.println("Please enter name of the second student:"); //computer prinout in command prompt to enter second student
			String student2 = kbReader.next(); //String mean link program to this method to pick up the value the keyboard and put it into from String.
			System.out.println("Welcome, you enter " +  student2); //when enter name so printout in command prompt sau "welcome, you enter" and put name on it what have you type up say enter second student
			int Student2 = 7; //start number 1 to 7 from 7 subjects
			int grades[] = new int[Student2]; //array list of grade and student mean up to 7 will stop 

			//for loop to take in grades
			for(int g =0; g <grades.length; g++)
			{
				System.out.println("Enter grade"); //enter grade pick anything number
				bgrade = kbReader.nextInt(); //Integer mean link program to this method to pick up the value the keyboard and put it into from Integer
				
				if(bgrade <=40) //use if statement from number to any number and printout System.out.println see which one get mark for that
				{
					System.out.println("D3 Scores: 40 points"); //see what points did you get
				}
				else if(bgrade <=45)
				{
			 		System.out.println("D2 Scores: 45 points"); //see what points did you get
				}
				else if(bgrade <=50)
				{
					System.out.println("D1 Scores: 50 points"); //see what points did you get
				}
				else if(bgrade <=55)
				{
					System.out.println("C3 Scores: 55 points"); //see what points did you get
				}
				else if(bgrade <=60)
				{
					System.out.println("C2 Scores: 60 points"); //see what points did you get
				}
				else if(bgrade <=65)
				{
					System.out.println("C1 Scores: 65 points"); //see what points did you get
				}
				else if(bgrade <=70)
				{
					System.out.println("B3 Scores: 70 points"); //see what points did you get
				} 
				else if(bgrade <=75)
				{
					System.out.println("B2 Scores: 75 points"); //see what points did you get
				}
				else if(bgrade <=80)
				{
					System.out.println("B1 Scores: 80 points"); //see what points did you get
				}
				else if(bgrade <=90)
				{		
					System.out.println("A2 Scores: 90 points"); //see what points did you get
				}
				else if(bgrade <=100)
				{
					System.out.println("A1 Scores: 100 points"); //see what points did you get
				}
				/*
				bhighest =  bhighest + bgrade; //add agrade to ahighest
				blowest =  blowest + bgrade;  //add agrade to alowest
				baverage = baverage + bgrade/7; //add agrade to aaverage
				*/
				btotal = btotal + bgrade; //add agrade to total
		
				if(bgrade <=40) //use if statment to see if the agrade is less than alowest
				{
					blowest = bgrade; //look for lowest number not highest
				}
				else if(bgrade >=50) //use an if statement to see if agrade is higher than bhighest 
				{
					bhighest = bgrade; // look for high number not lowest
				}
				
				if(bgrade >=41) //average to divde 7 use 6 subject
				{
				baverage = baverage + bgrade/7; //divide 7
				}
			} //end for loop



			System.out.println("\n"); //new line
			System.out.println("---------+++++++++++ " + student + " Points Calculation " + "+++++++++++++-----------"); //printout in comand prompt from first student
			System.out.println("The highest point: " + ahighest); //look for high number from agrade see which is highest point from grade
			System.out.println("The lowest point: " + alowest); //look for low number from agrade see which is lowest point from grade
			System.out.println("The average point: " + aaverage); //average just divide 7
			System.out.println("The total points scored is: " + atotal); //add all up from agrade
		
			System.out.println("---------+++++++++++ " + student2 + " Points Calculation " + "+++++++++++++-----------"); //printout in command prompt from second student
			System.out.println("The highest point: " + bhighest); //look for high number from bgrade see which is highest point from grade
			System.out.println("The lowest point: " + blowest); //look for low number from bgrade see which is lowest point from grade
			System.out.println("The average point: " + baverage); //average divide 7 look for answer
			System.out.println("The total points scored is: " + btotal); //add all up from bgrade 
			
			
		} //close curley bracket
			
} //close curley bracket
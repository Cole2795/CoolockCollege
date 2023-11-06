/**
 * @(#)studentTest.java
 *In the Test class, create an array of students which can hold student objects and MatureStudent objects.
 *The user will enter the information in for each object.
 *
 * @author
 * @version 1.00 2016/4/13
 */

import java.io.*;
import java.util.*;
import java.util.Date;
public class studentTest {

     public static void main (String args[]) {

		Scanner kbReader = new Scanner(System.in);

		Date d = new Date();

		String m_app, strchoice, strch, strc, strid;
		String name, address, course_name;
		int id, course_number, found = 0;
		int numstudents;

		boolean flag = false;
		//create the student array
		System.out.println("WELCOME");
		System.out.println("Enter number of students: ");
    	String strstudentarray = kbReader.next();
    	while(!strstudentarray.matches("\\d+")){
    		System.out.println("ERROR, Enter number of students: ");
    		strstudentarray = kbReader.next();
    	}//end while

		numstudents = Integer.parseInt(strstudentarray);
    	student s[] = new student[numstudents];

    	for (int i = 0; i<s.length;i++){

    		//kbReader.nextLine();

    		System.out.println("\nStudent " + (i+1));
    		System.out.println();

    		kbReader.nextLine();

			//enter name
    		System.out.println("Enter name : ");
    		name = kbReader.next();

			//enter id
    		System.out.println("Enter id for " + name + ":");
    		id = kbReader.nextInt();

			//enter address
    		System.out.println("Enter address for " + name + ":");
    		address = kbReader.next();

			//enter course name
    		System.out.println("Enter course name: ");
    		course_name = kbReader.next();

			//course number
    		System.out.println("Enter course id: ");
    		course_number = kbReader.nextInt();

    		kbReader.nextLine();

			//create the application
    		application a1 = new application(course_name, course_number);

			//ask if they are a mature student
			System.out.println("Is the applicant a mature student (y/n):");
			m_app = kbReader.next();
			m_app = m_app.toUpperCase();

			//validate for Y or N for mature student
			while(!(m_app.matches("Y") || m_app.matches("N"))){
				System.out.println("Error, Y or N only");
				System.out.println("Is the applicant a mature student (y/n):");
				m_app = kbReader.next();
				m_app = m_app.toUpperCase();
			}//end while

			char check1,check2;
    		String dob = "";
    		//boolean flag = false;

			if(m_app.matches("Y")){
			    	while(flag == false){
	    				System.out.print("Enter date of birth dd/mm/yyyy : ");
	    				dob = kbReader.next();
	    				if (dob.length()!=10){
	    					System.out.println("Error invalid format\n\nPlease enter dd/mm/yyyy");
    					}//end if dob !=10
		    			else{

				    		check1 = dob.charAt(2);
				    		check2 = dob.charAt(5);

				    		if ((check1=='/') && (check2 =='/')){	//check for the first /at position 3 and the second at poition 6
				    			System.out.println("YES");
				    			flag = true;
				    		}
				    		else{
				    			System.out.println("Error invalid format\n\nPlease enter dd/mm/yyyy");
				    		}


	    				}//end else if dob.length != 10
			    	}//end while flag == false


				//create maturestudent
				s[i] = new maturestudent(name, id, a1, address,dob);
			}//end if app = "Y"

			//if you not maturestudent
			if(m_app.matches("N")){
				//create student
				s[i] = new student(name, id, a1, address);
				System.out.println("NO");
			}//end if
		}//end for


			//print all the students
			for(int i = 0;i<s.length;i++){
				System.out.println(s[i]);
			}//end for



			int position = 0;
			int choice =0;

    		while(choice !=3){

    			////////////////////////////////////////////////////////choice menu option 1 to 3/////////////////////////////////////////////
				System.out.println("\nEnter choice: " + "\n1. View Course/Personal Details\n2. Edit Course/Personal details\n3. Quit");
	    		//choice = kbReader.nextInt();
	    		strchoice = kbReader.next();
	    		//validate for Enter choice 1 -3
	    		while(!strchoice.matches("[1-3]")){
	    			System.out.println("Error, Enter choice:  \n1. View Course/Personal Details\n2. Edit Course/Personal details\n3. Quit");
					strchoice = kbReader.next();

	    		}//end while
				choice = Integer.parseInt(strchoice);
				///////////////////////////////////////////choice 1 View personal/course////////////////////////////////////////////////////
	    		if(choice == 1){
    				System.out.println("Please enter id of applicant to display: ");
    				int Id = kbReader.nextInt();
    				//id = Integer.parseInt(strid);
    				for(int i =0; i<s.length; i++){
    					if(Id == s[i].getid()){

    						found = 1;
    						position = i;

  							System.out.println(s[i]);
    					}
  						else{
  							System.out.println("No ID found");
  						}//end if


    				}//end for

    			}//end if

    			if(choice == 2){
					///////////////////////////////////////////choice 2 Edit personal/course////////////////////////////////////////////////////
    				System.out.println("Please enter id of applicant to display 2: ");
    				strid = kbReader.next();
					int Id = kbReader.nextInt();
					for(int i =0; i<s.length; i++){
    					if(Id == s[i].getid()){

    						found = 1;
    						position = i;
    						System.out.println("Found " + s[i].getname());
    					}//end if
    				}//end for

					///////////////////////////////////////////choice:- 1 to 5///////////////////////////////////////////////////////////////////////////
    						int ch = 0;
    						while(ch !=5){
    							System.out.println("-------------------------------Select Choice------------------------------");
    							System.out.println("1. View Application detail\n2. View Personal details\n3. Change application details\n4. Change Personal details\n5. Quit");
    							strch = kbReader.next();
    							while(!strch.matches("\\d+")){
	    							 //System.out.println("ERROR");
	    							 System.out.println("Error\n1. View Application detail\n2. View Personal details\n3. Change application details\n4. Change Personal details\n5. Quit");
									 strch = kbReader.next();

	    							}//end while
									ch = Integer.parseInt(strch);

								///////////////////////////////////////////choice 1 Application details////////////////////////////////////////////////////
    							if(ch == 1){
    								System.out.println("\nApplication Details \nCourse Name: " + s[position].getcourse_name() + "\nCourse ID: " + s[position].getcourse_number());
    							}//end if ch ==1 application details

    							///////////////////////////////////////////choice 2 View personal details////////////////////////////////////////////////////
    							if(ch == 2){
    								System.out.println("Student Details \nName: " + s[position].getname() + "\nID: " + s[position].getid() + "\nAddress: " + s[position].getaddress());
    							}//end ch == 2 student details

    							///////////////////////////////////////////choice 3 Change application details////////////////////////////////////////////////////
    							if(ch == 3){
    								///////////////////////////////////////////choice 1 or 2 to change name or id////////////////////////////////////////////////////
    								System.out.println("Enter 1 to change course\n Enter 2 to change course id");
    								strc = kbReader.next();
    								while(!strc.matches("\\d+")){
	    							 System.out.println("ERROR");
	    							 System.out.println("Enter 1 to change course\n Enter 2 to change course id");
									 strc = kbReader.next();

	    							}//end while
									ch = Integer.parseInt(strc);


									///////////////////////////////////////////choice 1 chnge name////////////////////////////////////////////////////
    								if(ch == 1){
    									System.out.println("Enter course name: ");
    									course_name = kbReader.next();
    									s[position].setcourse_name(course_name);
    									System.out.println("Student Details\n Name: " + s[position].getname() + "\nID: " + s[position].getid() + "\nAddress: " + s[position].getaddress() + "\nApplication Details\nCourse name: " + s[position].getcourse_name() + "\nCourse id: " + s[position].getcourse_number());
    								}//end if c 1 enter course name

    								///////////////////////////////////////////choice 2 change id////////////////////////////////////////////////////
    								if (ch == 2){
    									System.out.println("Enter course id: ");
    									course_number = kbReader.nextInt();
    									s[position].setcourse_number(course_number);
    									System.out.println("Student Details\n Name: " + s[position].getname() + "\nID: " + s[position].getid() + "\nAddress: " + s[position].getaddress() + "\nApplication Details\nCourse name: " + s[position].getcourse_name() + "\nCourse id: " + s[position].getcourse_number());
    								}//end if c == 2 enter course id

    							}//end if ch 3 change application details

    							///////////////////////////////////////////choice 4 change course name or number////////////////////////////////////////////////////
    							if(ch == 4){
    								int cis;
    								System.out.println("Enter 1 to change name\n Enter 2 to change id ");
    								String strci = kbReader.next();
    								while(!strci.matches("\\d+")){
	    							 System.out.println("ERROR");
	    							 System.out.println("Enter 1 to change course\n Enter 2 to change course id ");
									 strci = kbReader.next();

	    							}//end while
									cis = Integer.parseInt(strci);

									///////////////////////////////////////////choice 1 change course name////////////////////////////////////////////////////
    								if(cis == 1){
    									System.out.println("Enter name: ");
    									name = kbReader.next();
    									s[position].setname(name);
    									System.out.println("Student Details\nName: " + s[position].getname() + "\nID: " + s[position].getid() + "\nAddress: " + s[position].getaddress() + "\nApplication Details\nCourse name: " + s[position].getcourse_name() + "\nCourse id: " + s[position].getcourse_number());
    								}//end if c 1 enter name

    								///////////////////////////////////////////choice 2 change id////////////////////////////////////////////////////
    								if (cis == 2){
    									System.out.println("Enter id: ");
    									id = kbReader.nextInt();
    									s[position].setid(id);
    									System.out.println("Student Details\nName: " + s[position].getname() + "\nID: " + s[position].getid() + "\nAddress: " + s[position].getaddress() + "\nApplication Details\nCourse name: " + s[position].getcourse_name() + "\nCourse id: " + s[position].getcourse_number());
    								}//end if c == 2 enter  id
    							}//end if ch == 4 change personal details

    							///////////////////////////////////////////choice 5 QUIT////////////////////////////////////////////////////
    							if(ch == 5){
    								System.out.println();
    							}//end cho == 5 quit
    							//else{
    							//	System.out.println("No number only 1 to 5\n Please choice 1 to 5");
    							//}

    						}//end while choice !=5


    			}//end if choice 2 Edit course/personal details

    			///////////////////////////////////////////choice 3 Quit and save file in Document////////////////////////////////////////////////////
				if(choice == 3){
					BufferedWriter Information = null;
					String loc1 = "college.doc";

					try{
						Information = new BufferedWriter (new FileWriter(loc1,true));
					}catch(Exception e){
						System.out.println("No access to the file location");
					}

					//it will be collegeStudents (int i =0; i<s.length; i++)
	    			for (int i = 0;i<s.length;i++){

		   				try{

							Information.newLine();

							Information.write(s[i].toString());
						 //it will be collegeStudents (or the name of your student s[] array)
							if(i==s.length-1){
								Information.newLine();
								Information.close();
								//Date d = new Date();
								System.out.println("\nFile Updated on " + d.toString() + "\n");
							}//end if

						}//end try
						catch(Exception ex){
							System.out.println("Could not access file");
						}//end catch

				}//end for


				//end of writing to a file

				System.out.println("\nFile updated\n");
				System.out.println("Thank you for using CAO online\n\n");
			}//end if choice quit

    	}//end while


	}// end main method




}//end class
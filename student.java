/**
 * @(#)student.java
 *Student class: - student class will have an application and an address. Student is an applicant.
 *
 * @author
 * @version 1.00 2016/4/7
 */


public class student extends applicant {

private application a1;
private String address;
private static int counter = 0;

    public student(String n, int i, application a1, String a) {
    	super(n, i);
    	this.a1 = a1;
    	this.address = a;
    	counter++;
    }//end student

    public void setaddress(String a){
    	this.address = a;
    }//end setaddress

    public String getaddress(){
    	return address;
    }//end getaddress

	public static int getcounter(){
    	return counter;
    }//getcounter

	public String getcourse_name(){
    	return a1.getcourse_name();
    }//a1.getcourse_name

   public int getcourse_number(){
    	return a1.getcourse_number();
    }//a1.getcourse_number

	public void setcourse_name(String cn){
   		a1.setcourse_name(cn);
    }//end a1.setcourse_name

    public void setcourse_number(int cnu){
   		a1.setcourse_number(cnu);
    }//end a1.setcourse_number

    public String toString(){
    	return super.toString() + "\nApplication Details: " + a1.toString() + "\nAddress: " + address;
    }//end toString


}//end class
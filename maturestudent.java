/**
 * @(#)maturestudent.java
 *MatureStudent class: - MatureStudent is a student and has a date of birth
 *
 * @author
 * @version 1.00 2016/4/7
 */


public class maturestudent extends student {

	private String  dob;

    public maturestudent(String n, int i, application a1, String a, String dob) {
    	super(n, i, a1, a);
    	this.dob = dob;
    }//end maturestudent

    public void setdob(String dob){
    	this.dob = dob;
    }//end setdob

    public String getdob(){
    	return dob;
    }//end getdob

    public String toString(){
    	return super.toString() + "\nDate of Birth: " + dob;
    }//end toString


}//end class
/**
 * @(#)application.java
 *Application class: - Application class will have course name and course number.
 *
 * @author
 * @version 1.00 2016/4/7
 */


public class application {

private String course_name;
private int course_number;

    public application(String cn, int cnu) {
    	this.course_name = cn;
    	this.course_number = cnu;

    }//application

    public void setcourse_name(String cn){
    	this.course_name = cn;
    }//end setcourse_name

    public String getcourse_name(){
    	return course_name;
    }//end getcourse_name

    public void setcourse_number(int cnu){
    	this.course_number = cnu;
    }//end setcourse_number

    public int getcourse_number(){
    	return course_number;
    }//end getcourse_number

    public String toString(){
    	return "\nCourse Name: " + course_name + "\nCourse Number: " + course_number;
    }//end toString


}//end class
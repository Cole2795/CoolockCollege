/**
 * @(#)applicant.java
 *Applicant class: - An applicant has a name and an id.
 *
 * @author
 * @version 1.00 2016/4/7
 */


public class applicant {

private String name;
private int id;

    public applicant(String n, int i) {
    	this.name = n;
    	this.id = i;
    }//end applicant

    public void setname(String n){
    	this.name = n;
    }//end setname

    public String getname(){
    	return name;
    }//end getname

    public void setid(int i){
    	this.id = i;
    }//end setid

    public int getid(){
    	return id;
    }//end getid

    public String toString(){
    	return "\nStudent Detials\nName: " + name + "\nID: " + id;
    }//end toString


}//end class
/**
 * @(#)pratise.java
 *
 *
 * @author
 * @version 1.00 2016/9/18
 */
import java.io.*;
import java.util.*;
public class pratise {

    private String name;
    private String course;
    private int age;

    public pratise(String name, String course, int age){
    	this.name = name;
    	this.course = course;
    	this.age = age;
    }//end constructor

    public String toString(){
    	return "\nName " + name + "\nCourse " + course + "\nage " + age;
    }


}
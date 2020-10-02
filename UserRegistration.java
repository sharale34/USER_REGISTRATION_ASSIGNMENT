package com.BridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	     public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.out.println("Welcome To The User Registration Program");
	     Scanner sc = new Scanner (System.in);
	     //check first name
	     System.out.println("Enter the first Name :");
	     String fName = sc.nextLine();
	     String patternName ="^[A-Z][a-z]{2,}$";
	     Pattern p = Pattern.compile(patternName);
	     Matcher m1 = p.matcher(fName);
	     if(m1.matches())
	     {
	     	System.out.println("The first Name of the user is: "+fName);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input for first name");
	     }
	     
	     //check last name
	     System.out.println("Enter the last Name :");
	     String lName = sc.nextLine();
	     Matcher m2 = p.matcher(lName);
	     if(m2.matches())
	     {
	     	System.out.println("The last name of the user is: "+lName);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input for last name");
	     }
	     
	     //check Mobile Number
	     System.out.println("Enter the phone number :");
	     String phoneNum = sc.nextLine();
	     String patternPhone ="^[9][1]\\\\s[7-9]{1}[0-9]{9}$";
	     Pattern p2 = Pattern.compile(patternPhone);
	     Matcher m4 = p2.matcher(phoneNum);
	     if(m4.matches())
	     {
	     	System.out.println("The phone number of the user is: "+phoneNum);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input for phone number");
	     }
	     
	     //check password
	     System.out.println("Enter the password :");
	     String password = sc.nextLine();
	     String patternPass ="^[9][1]\\\\s[7-9]{1}[0-9]{9}$";
	     Pattern p3 = Pattern.compile(patternPass);
	     Matcher m5 = p3.matcher(password);
	     if(m5.matches())
	     {
	     	System.out.println("The password of the user is: "+password);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input for password");
	     }
	     
	     //check email Address
	     System.out.println("Enter the email ID :");
	     String emailID = sc.nextLine();
	     String patternEmail ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	     Pattern p1 = Pattern.compile(patternEmail);
	     Matcher m3 = p1.matcher(emailID);
	     if(m3.matches())
	     {
	     	System.out.println("The Email ID of the user is: "+emailID);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input for email ID");
	     }
	}

}




package com.BridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	     public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.out.println("Welcome To User Registration Program");
	     Scanner sc = new Scanner (System.in);
	     System.out.println("Enter the email ID :");
	     String emailID = sc.nextLine();
	     String pattern ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	     Pattern p = Pattern.compile(pattern);
	     Matcher m1 = p.matcher(emailID);
	     if(m1.matches())
	     {
	     	System.out.println("The Email ID of the user is: "+emailID);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input");
	     }
	}

}




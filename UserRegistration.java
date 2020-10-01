package com.BridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	     public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.out.println("Welcome To User Registration Program");
	     Scanner sc = new Scanner (System.in);
	     System.out.println("Enter the password :");
	     String password = sc.nextLine();
	     String pattern ="^[A-Za-z0-9-]{8,}$";
	     Pattern p = Pattern.compile(pattern);
	     Matcher m1 = p.matcher(password);
	     if(m1.matches())
	     {
	     	System.out.println("The email ID of the user is: "+password);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input");
	     }
	}

}




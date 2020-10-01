package com.BridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	     public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.out.println("Welcome To User Registration Program");
	     Scanner sc = new Scanner (System.in);
	     System.out.println("Enter the mobile number :");
	     String mobileNum = sc.nextLine();
	     String pattern ="^[9][1]\\s[7-9]{1}[0-9]{9}$";
	     Pattern p = Pattern.compile(pattern);
	     Matcher m1 = p.matcher(mobileNum);
	     if(m1.matches())
	     {
	     	System.out.println("The email ID of the user is: "+mobileNum);
	     }
	     else
	     {
	    	 System.out.println("Enter a valid input");
	     }
	}

}




package com.BridgeLabz.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean firstNameValidation(String firstName) {
		String pattern="^[A-Z][a-z]{2,}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher fNameMatcher=namePattern.matcher(firstName);
		
		if(fNameMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean lastNameValidation(String lastName) {
		String pattern="^[A-Z][a-z]{2,}$";
		Pattern namePattern=Pattern.compile(pattern);
		Matcher lNameMatcher=namePattern.matcher(lastName);
		
		if(lNameMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean emailValidation(String email) {
		String pattern="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailPattern=Pattern.compile(pattern);
		Matcher emailMatcher=emailPattern.matcher(email);
		
		if(emailMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean phoneNumberValidation(String phoneNo) {
		String pattern="^[0-9]{2}(\\s)[7-9][0-9]{9}$";
		Pattern phonePattern=Pattern.compile(pattern);
		Matcher phoneMatcher=phonePattern.matcher(phoneNo);
		
		if(phoneMatcher.matches()) {
			return true;
		}
		else
			return false;
	}
	public boolean passwordValidation(String password) {
		String pattern="^(?=.*[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])[A-Za-z0-9!@#$%^&*?]{8,}$";
		Pattern passwordPattern=Pattern.compile(pattern);
		Matcher passwordMatcher=passwordPattern.matcher(password);
		
		if(passwordMatcher.matches()) {
			return true;
		}
		else
			return false;
		}

}




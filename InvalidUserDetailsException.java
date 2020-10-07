package com.BridgeLabz.UserRegistration;

@SuppressWarnings("serial")
public class InvalidUserDetailsException extends Exception
{
	public InvalidUserDetailsException(String message) {
		System.out.println(message);
	}
}

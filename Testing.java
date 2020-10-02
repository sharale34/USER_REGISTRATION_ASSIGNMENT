package com.BridgeLabz.UserRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Testing {
	@Test
	public void HappyTest() {
		UserRegistration obj = new UserRegistration();
		boolean firstName = obj.firstNameValidation("Sourabh");
		assertEquals(true, firstName);
		boolean lastName = obj.lastNameValidation("Harale");
		assertEquals(true, lastName);
		boolean email = obj.emailValidation("hsourabh@gmail.com");
		assertEquals(true, email);
		boolean phoneNo = obj.phoneNumberValidation("91 9494118273");
		assertEquals(true, phoneNo);
		boolean password = obj.passwordValidation("Hsourabh@12");
		assertEquals(true, password);
	}

	@Test
	public void SadTest() {
		UserRegistration obj = new UserRegistration();
		boolean firstName = obj.firstNameValidation("So");
		assertEquals(false, firstName);
		boolean lastName = obj.lastNameValidation("ha");
		assertEquals(false, lastName);
		boolean email = obj.emailValidation("abc@");
		assertEquals(false, email);
		boolean phoneNo = obj.phoneNumberValidation("91164625");
		assertEquals(false, phoneNo);
		boolean password = obj.passwordValidation("aaan#7");
		assertEquals(false, password);
	}
}


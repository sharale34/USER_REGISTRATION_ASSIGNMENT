package com.BridgeLabz.UserRegistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmailTesting {
	@Test
	public void testEmail()
	{
		UserRegistration obj = new UserRegistration();
		assertTrue("Check pattern defined for correct type of Email 1", obj.emailValidation("abc-100@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 2", obj.emailValidation("abc@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 3", obj.emailValidation("abc.100@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 4", obj.emailValidation("abc111@yahoo.com"));
		assertTrue("Check pattern defined for correct type of Email 5", obj.emailValidation("abc-100@abc.net"));
		assertTrue("Check pattern defined for correct type of Email 6", obj.emailValidation("abc.100@abc.com.au"));
		assertTrue("Check pattern defined for correct type of Email 7", obj.emailValidation("abc@1.com"));
		assertTrue("Check pattern defined for correct type of Email 8", obj.emailValidation("abc@gmail.com.com"));
		assertTrue("Check pattern defined for correct type of Email 9", obj.emailValidation("abc+100@gmail.com"));
		
		assertFalse("Check pattern defined for wrong type of Email", obj.emailValidation("abc.xybl.co.in"));
		assertFalse("Check pattern defined for wrong type of Email", obj.emailValidation("abcd.xyz.bl.co.in"));
	}
}

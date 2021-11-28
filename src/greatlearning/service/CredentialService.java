package greatlearning.service;
import java.util.Random;

import greatlearning.model.*;
public class CredentialService {
	
	public char [] generatePassword () {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz" +"\\.[]{}()<>*+-=!?^$|";
		
		Random random = new Random ();
		
		char [] password = new char [8];
		
		for (int i=0 ;i<8 ;i++)
		{
			password[i] = AlphaNumericString.charAt(random.nextInt(AlphaNumericString.length()));
		}
		
		return password;
		
	}
	
	
	public String generateEmailAddress (String firstName , String lastName , String dept)
	{
		return firstName+lastName+"@"+dept+"."+"abc.com";
	}
	
	public void showCredentials (Employee employee , String email , char [] password )
	{
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email        --->  " + email);
		System.out.println("Password ---> " + password.toString());
		
		
	}
	
}

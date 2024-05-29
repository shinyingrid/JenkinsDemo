package ContactPackage;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContTest()
	{
		String USERNAME = System.getProperty("username");
		System.out.println("createContTest==>1");
		System.out.println("username is :"+USERNAME);
	}
	
	@Test
	public void deletContTest()
	{
		String PASSWORD = System.getProperty("password");
		System.out.println("deletContTest==>2");
		System.out.println("password is :"+PASSWORD);
	}
	
	//updated lombok dependency
}

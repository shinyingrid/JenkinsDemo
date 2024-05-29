package OrgPackage;

import org.testng.annotations.Test;

public class OrgTest 
{
	@Test
	public void createOrgTest()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println("createOrgTest==>3");
		System.out.println("browser is :"+BROWSER);
	}
	
	@Test
	public void deleteOrgTest()
	{
		String URL = System.getProperty("url");
		System.out.println("deleteOrgTest==>4");
		System.out.println("url is :"+URL);
	}
	
	//updated lombok dependency
}

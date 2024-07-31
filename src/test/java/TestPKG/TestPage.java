package TestPKG;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginPKG.LoginPage;
import SubClass.Subclass;



public class TestPage extends Subclass {
	
	
@BeforeMethod
public void Beformeth()
{
	LoginPage objt=new LoginPage(driver);
}
@Test
public void  SendEnquaries()
{
	LoginPage objt=new LoginPage(driver);
	objt.SendEnquaries();
	
	
}
	@Test
	public void selectitem()throws Exception
	{
		LoginPage objt=new LoginPage(driver);
		objt.selectitem();
	}
	
	@Test
	public void verify()
	{
		LoginPage objt=new LoginPage(driver);
		objt.verify();
	}
	@Test
	public void nextslide()
	{
		LoginPage objt=new LoginPage(driver);
		objt.nextslide();
	}
	
}

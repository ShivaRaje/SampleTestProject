package testPackage;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mainpackage.MainClass;
import objectPackage.LoginObject;

@Listeners(listener.ListenerClass.class)
public class TestClass extends MainClass{
	 
@Test(dataProvider = "LoginData")
public void login123(String UserName, String Password,String Run)
{
	if (Run.equals("No"))
		throw new SkipException("Run is skipped");
	LoginObject obj=new LoginObject(driver);
	obj.login(UserName,Password);
	
}
@DataProvider(name="LoginData")
public Object[][] sampledata(){
Object[][] data = getExcelData("Testdata.xlsx", "shiva");
return data;
}
}

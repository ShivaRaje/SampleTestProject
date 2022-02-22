package testPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import mainpackage.SampleClass;
import objectPackage.SampleObject;

@Test
public class SampleTestClass extends SampleClass{
	public void loginfb() throws InterruptedException
	{
		SampleObject obj=new SampleObject(driver);
				obj.shiva1();
				/*try {
					obj.enterMobileNumber();
					}
					catch(Exception e) {
					obj.resetTerminal();
					obj.login(Username,Password);
					obj.enterMobileNumber();
					}*/
	}

}

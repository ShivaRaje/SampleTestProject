package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SampleClass {
	public WebDriver driver;
	@BeforeTest
	public void chromelaunch()
	{

	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://cashwrap.expertsoftsys.com/");
	driver.manage().window().maximize();
}
	/*@AfterTest
	public void launchClose()
	{
	driver.close();
	}*/
}

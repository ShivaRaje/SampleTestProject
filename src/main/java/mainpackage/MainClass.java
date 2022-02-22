package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataprovider.DataProviderClass;

public class MainClass {
	public WebDriver driver;
	@BeforeTest
		public void launch()
		{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		}

	
	@AfterTest
	public void launchClose()
	{
	driver.close();
	}

	
	 public Object[][] getExcelData(String excelName, String sheetName){
		 String excelLocation = System.getProperty("user.dir")+"/src/main/resources/"+excelName;
		 //log.info("excel location "+excelLocation);
		 DataProviderClass excelHelper = new DataProviderClass();
		 Object[][] data = excelHelper.getExcelData(excelLocation, sheetName);
		 return data;
		 }
}

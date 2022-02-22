package objectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
	WebDriver driver;
	@FindBy(id="email")
	WebElement inp_username;
	@FindBy(id="Password")
	WebElement inp_lastname;
	
	
	
	public LoginObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(String UserName,String Password)
	{
		inp_username.sendKeys(UserName);
		inp_lastname.sendKeys(Password);
	}
}

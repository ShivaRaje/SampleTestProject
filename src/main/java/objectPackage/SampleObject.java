package objectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleObject {
	WebDriver driver;
	
	@FindBy(xpath="//select[@id='ddlTerminal']")
	public WebElement select;
	@FindBy(xpath="//select[@id='ddlTerminal']//following::option[@value='T01']")
	public WebElement option;
	//option[@value='T01']
	@FindBy(xpath="//input[@id='txtUserId']")
	public WebElement username;
	@FindBy(xpath="//input[@id='txtPwd']")
	public WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")
	public WebElement login;

	
	@FindBy(xpath="//input[@id='txtCMobileNo']")
	public WebElement mobno;
	@FindBy(xpath="//button[@id='btnCusOK']")
	public WebElement ok;
	
	public SampleObject(WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver, this);
			}
public void shiva1() throws InterruptedException
{
	Thread.sleep(3000);
	select.click();
	option.click();
	Thread.sleep(3000);
	username.sendKeys("sa");
	password.sendKeys("@stra");
	login.click();
	mobno.sendKeys("7904049368");
	ok.click();
}


}
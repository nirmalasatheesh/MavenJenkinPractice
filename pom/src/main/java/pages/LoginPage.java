package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	
	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.test=test;
	}
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	
	public LoginPage typeUserName(String username) {
		type(eleUserName, username);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	public LoginPage typePassword(String password) {
		type(elePassword, password);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage(driver,test);
	}
	
	/*public void clickLogin1() {
		click(locateElement("xpath", "//input[@value='Login']"));
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

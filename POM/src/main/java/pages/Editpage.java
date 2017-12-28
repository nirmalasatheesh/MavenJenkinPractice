package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class Editpage extends ProjectMethods{
	
	public Editpage (RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleeditfirstname;
	
	
	public Editpage typefirstnameedit(String editfName) 
	{
		type(eleeditfirstname,editfName );
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleupdatebutton;
	
	public ViewPage clickupdatebutton() 
	{
		click(eleupdatebutton);
		return new ViewPage(driver,test);
	}
}

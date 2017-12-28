package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyname;
	
	
	public CreateLeadPage typecompanyname(String cName) {
		type(elecompanyname, cName);
		return this;
	}
	
	@FindBy(how = How.ID,using = "createLeadForm_firstName")
	private WebElement elefirstname;
	
	public CreateLeadPage typefirstname(String firstname)
	{
		type(elefirstname,firstname);
		return this;
	}
	
	@FindBy(how = How.ID,using = "createLeadForm_lastName")
	private WebElement elelastname;
	
	public CreateLeadPage typelastname(String lName)
	{
		type(elelastname,lName);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement elecreateleadbutton;
	
	public ViewPage clickcreateleadbutton() 
	{
		click(elecreateleadbutton);
		return new ViewPage(driver,test);
	}
}

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
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.test=test;
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeadPage typeCompanyName(String companyname)
	{
		type(eleCompanyName,companyname);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeadPage typeFirstName(String firstname){
		type(eleFirstName,firstname);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage typeLastName(String lastname){
		type(eleLastName,lastname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNum;
	public CreateLeadPage typePhoneNum(String num){
		type(elePhoneNum,num);
		return this;
		
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleFind;
	public ViewLeadPage clickFindLead(){
		click(eleFind);
		return new ViewLeadPage(driver,test);

}
}
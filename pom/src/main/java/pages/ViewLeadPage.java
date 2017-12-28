package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
		this.test=test;
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleExactFirstName;
	public ViewLeadPage verifyExpectedTextfyFirstName(String firstname){
		verifyExactText(eleExactFirstName,firstname);
		//verifyExpectedTitle(String expectedTitle);


		return this;
	}

	@FindBy(how=How.TAG_NAME,using="title")
	private WebElement eleVerifyPageTitle;
	public ViewLeadPage verifyExpectedTitle(String pagetitle){
		verifyTitle(pagetitle);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEdit;
	public EditLeadPage clickEdit(){
		getTitle();
		click(eleEdit);
		return new EditLeadPage(driver,test);


	}

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompName;
	public ViewLeadPage verifyCompName(String cname){
		verifyPartialText(eleCompName, cname);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDelete;
	public MyLeadPage clickDelete(){
		click(eleDelete);
		return new MyLeadPage(driver,test);
	}
}






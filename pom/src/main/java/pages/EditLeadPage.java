package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {

	public EditLeadPage(RemoteWebDriver driver,ExtentTest test) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.test=test;
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompname;
	public EditLeadPage typeCompName(String compname){
		type(eleCompname,compname);
		return this;
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdate;
	public ViewLeadPage clickUpdate(){
		click(eleUpdate);
		return new ViewLeadPage(driver,test);
	}


}



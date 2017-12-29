package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods 
{
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.test=test;
		
	
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleclickFromId;
	public FindLeadPage clickFromLead(){
		clickWithNoSnap(eleclickFromId);
		switchToWindow(1);
		return new FindLeadPage(driver,test);
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLead;
	public FindLeadPage clickToLead(){
		clickWithNoSnap(eleToLead);
		switchToWindow(1);
		return new FindLeadPage(driver,test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;
	public void clickMerlead(){
		click(eleMergeButton);
		acceptAlert();
	}
	

}

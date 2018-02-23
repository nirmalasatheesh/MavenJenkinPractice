package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.XPATH,using="(//input[@name = 'id'])")
	private WebElement eleeditleadid;
		
	public FindLeadPage typemergefirstleadid(String editleadid)	
	{
		type(eleeditleadid, editleadid);
		return this;
	}
	
	
	
	@FindBy(how = How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindleadbutton;
	
	public FindLeadPage clickmergeFindtlead() throws InterruptedException 
	{
		click(elefindleadbutton);
				return this;
	}
	@FindBy(how = How.XPATH,using ="//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']//a")
	private WebElement elegridfirst;
	
	public MergeLeadPage selectgridmergefirst() 
	{
		click(elegridfirst);
		switchToWindow(0);
		return new MergeLeadPage(driver,test);
	}
	
	
}

	
	
	
	
	
	

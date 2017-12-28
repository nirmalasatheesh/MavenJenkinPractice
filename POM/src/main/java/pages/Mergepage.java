package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class Mergepage extends ProjectMethods{
	
	public Mergepage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='partyIdFrom']/following::img[1]")
	private WebElement elemergefirsticon;
	
	
	public Mergepage Clickmergefirsticon() 
	{
		clickWithNoSnap(elemergefirsticon);
		switchToWindow(1);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "//input[@name='id']")
	private WebElement eletypemergefirstleadid;
	
	public Mergepage typemergefirstleadid(String firstleadid) 
	{
		type(eletypemergefirstleadid,firstleadid);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "//button[contains(text(),'Find Leads')]")
	private WebElement eleclickmergefindlead;
	
	public Mergepage clickmergeFindtlead() throws InterruptedException 
	{
		click(eleclickmergefindlead);
		Thread.sleep(3000);
		return this;
	}
	

	@FindBy(how = How.XPATH,using = "((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a)[1]")
	private WebElement eleselectmergefirstgrid;
	
	public Mergepage selectgridmergefirst() 
	{
		click(eleselectmergefirstgrid);
		switchToWindow(0);
		return this;
	}

	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement elemergesecondicon;
	
	public Mergepage Clickmergesecondicon() 
	{
		clickWithNoSnap(elemergesecondicon);
		switchToWindow(1);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "//input[@name='id']")
	private WebElement eletypemergesecondleadid;
	
	public Mergepage typemergesecondleadid(String secondleadid) 
	{
		type(eletypemergesecondleadid,secondleadid);
		//switchToWindow(0);
		return this;
	}
	
	@FindBy(how = How.XPATH,using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleselectmergesecondgrid;
	
	public Mergepage selectgridmergesecond() 
	{
		click(eleselectmergesecondgrid);
		switchToWindow(0);
		return this;
	}
	
	@FindBy(how = How.LINK_TEXT	,using = "Merge")
	private WebElement elemergebutton;
	
	public Mergepage clickmergebutton() 
	{
		click(elemergebutton);
		acceptAlert();
		return this;
	}
	
	
	

}



	
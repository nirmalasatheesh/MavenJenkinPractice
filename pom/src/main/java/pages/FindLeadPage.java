package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods {
	public FindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.test=test;
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeadPage typeFirstName(String firstname){
		System.out.println(getTitle());
		type(eleFirstName,firstname);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleleadbutton;
	public FindLeadPage clickLeadButton(){
		click(eleleadbutton);
		return this;

	}

	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleresultgrid;
	public ViewLeadPage clickResultGrid(){
		click(eleresultgrid);
		return new ViewLeadPage(driver,test);
	}

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Lead ID:')]/following::input")
	private WebElement eleLeadId;
	public FindLeadPage typeLeadId(String id){
		type(eleLeadId,id);
		return this;

	}
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleButton;
	public FindLeadPage clickLeadButton1() throws InterruptedException{
		click(eleButton);
		Thread.sleep(3000);
		return this;

	}

	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
	private WebElement eleGridLink;
	public MergeLeadPage clickResultGrid1(){
		clickWithNoSnap(eleGridLink);
		switchToWindow(0);
		return new MergeLeadPage(driver,test);
	}

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Lead ID:')]/following::input")
	private WebElement eleLeadId1;
	public FindLeadPage typeLeadId1(String id){
		type(eleLeadId1,id);
		return this;	
	}

	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eleButton2;
	public FindLeadPage clickLeadButton2(){
		click(eleButton2);
		return this;
	}


	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
	private WebElement eleGridLink1;
	public MergeLeadPage clickResultGrid2(){
		clickWithNoSnap(eleGridLink1);
		switchToWindow(0);
		return new MergeLeadPage(driver,test);
	}	


	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhone;
	public FindLeadPage clickPhone(){
		click(elePhone);
		return this;
	}

	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNum;
	public FindLeadPage typePhoneNum(String num) throws InterruptedException{
		type(elePhoneNum, num);
		Thread.sleep(3000);
		return this;

	}
	


}
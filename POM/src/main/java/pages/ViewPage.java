package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewPage extends ProjectMethods {
	
		public ViewPage(RemoteWebDriver driver,ExtentTest test) {
			this.driver=driver;
			this.test=test;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(how=How.ID,using = "viewLead_firstName_sp")
	private WebElement eleverifyfname;
	
		public ViewPage verifyfname(String fname)
		{
			verifyExactText(eleverifyfname,fname);
			
			return this;
		}
		
	  @FindBy(how=How.XPATH,using ="//span[@id= 'viewLead_companyName_sp']")
		private WebElement eleverifyleadid;
		
		public ViewPage verifyleadid(String leadid)
		{
			verifyPartialText(eleverifyleadid, leadid);
			//verifyExactText(eleverifyleadid,cname);
			return this;
		}
		
		@FindBy(how=How.LINK_TEXT,using="Edit")
		private WebElement eleeditdbutton;
		
		public Editpage clickeditleadbutton() 
		{
			
			click(eleeditdbutton);
			
			return new Editpage(driver,test);
		}

		
	}


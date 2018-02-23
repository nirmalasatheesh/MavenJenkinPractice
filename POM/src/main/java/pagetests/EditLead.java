package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	@BeforeClass
	public void setValues()
	
	{
		browserName = "chrome";
		dataSheetName = "editlead";
		testcasename = "Edit lead";
		testcasedescription = "Edit a editing Lead";
		category = "smoke";
		author = "Nirmaladevi";
		
		
	}
	@Test(dataProvider="fetchData")
	public void editLead(String editleadid,String leadid,String editfName ) throws InterruptedException {
		new MyHomePage(driver, test)
		.clickLeadTab()
		.clickFindLead()
		.typeeditleadid(editleadid)
		.clickfindleadsbutton()
		.clickfirstnamegrid()
		.verifyleadid(leadid)
		.clickeditleadbutton()
		.typefirstnameedit(editfName)
		.clickupdatebutton();
	}

	}



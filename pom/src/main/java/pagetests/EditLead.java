package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setValues(){
		browserName="chrome";
		dataSheetName="Editlead";
		testCasename="Edit lead";
		testcasedescription="Edit some changes in the page";
		authorname="Bavani";
		category="Smoke test";
	}
	
	
	@Test(dataProvider="fetchData")
	public void editLead(String firstname,String compname)
	{
		//String pagetitle="";
		
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickFindLead()
		.typeFirstName(firstname)
		.clickLeadButton()
		.clickResultGrid()
		.clickEdit()
		.typeCompName(compname)
		.clickUpdate()
		.verifyCompName(compname);
		
	}


	
	}




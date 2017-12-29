package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	@BeforeClass
	public void setValues(){
		browserName="chrome";
		dataSheetName="CreateLead";
		testCasename="Create lead";
		testcasedescription="Create a new lead";
		authorname="Bavani";
		category="Smoke test";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName) {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickFindLead()
		.verifyExpectedTextfyFirstName(fName);
		
	}
}

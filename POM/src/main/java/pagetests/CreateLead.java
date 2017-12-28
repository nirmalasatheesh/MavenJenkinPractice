package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@BeforeClass
	public void setValues()
	
	{
		browserName = "chrome";
		dataSheetName = "createlead";
		testcasename = "Create lead";
		testcasedescription = "Create a new Lead";
		category = "smoke";
		author = "Nirmaladevi";
		
		
	}
	@Test(dataProvider="fetchData")
	public void createLead(String fName,String lName,String cName) {
		new MyHomePage(driver, test)
		.clickLeadTab()
		.clickCreateLead()
		.typecompanyname(cName)
		.typefirstname(fName)
		.typelastname(lName)
		.clickcreateleadbutton()
		.verifyfname(fName);
		
	}
}

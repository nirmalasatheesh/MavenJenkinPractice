package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods {
	@BeforeClass
	public void setValues(){
		browserName="chrome";
		dataSheetName="DeleteLead";
		testCasename="Delete lead";
		testcasedescription="Delete lead using phonenumbers";
		authorname="Bavani";
		category="Smoke test";
	}
	
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String num) throws InterruptedException{
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickFindLead()
		.clickPhone()
		.typePhoneNum(num)
		.clickLeadButton()
		.clickResultGrid()
		.clickDelete();
	}
	


}

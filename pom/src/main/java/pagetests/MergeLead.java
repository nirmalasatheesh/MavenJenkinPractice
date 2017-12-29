package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {
	
	@BeforeClass
	public void setValues(){
		browserName="chrome";
		dataSheetName="MergeLead";
		testCasename=" Merge lead";
		testcasedescription="All leads are Merged";
		authorname="Bavani";
		category="Smoke test";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String id1, String id2) throws InterruptedException{
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickMergeLead()
		.clickFromLead()
		.typeLeadId(id1)
		.clickLeadButton1()
		.clickResultGrid1()
		.clickToLead()
		.typeLeadId1(id2)
		.clickLeadButton2()
		.clickResultGrid2()
		.clickMerlead();
		
		
		
	}
	

}

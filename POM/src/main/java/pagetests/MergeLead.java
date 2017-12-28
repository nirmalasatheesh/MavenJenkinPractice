package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{

	@BeforeClass
	public void setValues()
	
	{
		browserName = "chrome";
		dataSheetName = "mergelead";
		testcasename = "Merge lead";
		testcasedescription = "Merge the two lead id's";
		category = "smoke";
		author = "Nirmaladevi";
		
		
	}
	@Test(dataProvider="fetchData")
	public void editLead(String firstleadid,String secondleadid) throws InterruptedException {
		new MyHomePage(driver, test)
		.clickLeadTab()
		.clickMergeLead()
		.Clickmergefirsticon()
		.typemergefirstleadid(firstleadid)
		.clickmergeFindtlead()
		.selectgridmergefirst()
		.Clickmergesecondicon()
		.typemergesecondleadid(secondleadid)
		.clickmergeFindtlead()
		.selectgridmergesecond()
		.clickmergebutton();
		
	}
}

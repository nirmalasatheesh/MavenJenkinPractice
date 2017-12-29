package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ExcelDataProvider;

public class ProjectMethods extends SeMethods{
	
	/*public String browserName = "chrome";
	public String dataSheetName;*/
	
	public String browserName,dataSheetName;
	public String testCasename,testcasedescription,authorname,category;

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCasename, testcasedescription);
		test.assignCategory(category);
		test.assignAuthor(authorname);
		startApp(browserName,"http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	/*public void beforeMethod(){
		test = startTestCase("Create Lead", "Create a new Lead");
		test.assignCategory("smoke");
		test.assignAuthor("Bavani");
		startApp(browserName,"http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}*/
	}
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		closeAllBrowsers();
		
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return new ExcelDataProvider().getExcelData(dataSheetName);		
	}	
	
}

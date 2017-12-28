package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import utils.ExcelDataProvider;

public class ProjectMethods extends SeMethods{
	
	public String browserName,dataSheetName;
	public String testcasename,testcasedescription,category,author;
	
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testcasename, testcasedescription);
		test.assignCategory(category);
		test.assignAuthor(author);
		startApp(browserName,"http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
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

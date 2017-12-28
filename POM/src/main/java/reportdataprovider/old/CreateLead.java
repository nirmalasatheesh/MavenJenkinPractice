package reportdataprovider.old;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelDataProvider;
import wdMethods.ProjectMethods;



public class CreateLead extends ProjectMethods {

	@Test(dataProvider ="fetchData")
	
	public void createdlead1(String firstname1, String lastname1,String companyname1) throws InterruptedException {



		WebElement lead =locateElement("link", "Leads");
		click(lead);

		WebElement 	createlead =locateElement("link", "Create Lead");
		click(createlead);


		WebElement companyname = locateElement("id","createLeadForm_companyName");
		type(companyname, companyname1);

		WebElement firstname = locateElement("id","createLeadForm_firstName");
		type(firstname, firstname1);

		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname, lastname1);


		WebElement createleadbutton = locateElement("name", "submitButton");
		click(createleadbutton ); 



	}

	/*	@DataProvider(name = "fetchData")
			public static Object[][] getData() {
				Object[][] data = new Object[2][3];
				data[0][0] = "Babu";
				data[0][1] = "M";
				data[0][2] = "TestLeaf";
				data[1][0] = "Nesa";
				data[1][1] = "kumar";
				data[1][2] = "TestLeaf";
				return data;*/


	@DataProvider(name = "fetchData")
	public  String[][] getData(){
		//String[][] data1 = new String[2][3];
		ExcelDataProvider rd = new ExcelDataProvider();
		String[][] data = rd.getExcelData("createlead");
		return data;

	}
	
}


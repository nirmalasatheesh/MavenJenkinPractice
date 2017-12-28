package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelDataProvider;
import wdMethods.ProjectMethods;



public class CreateLead extends ProjectMethods  {


	@Test(dataProvider ="CreateLead")

	public  void creatLead(String comp,String fs,String ls) throws InterruptedException {
		//launch the browser
		//SeMethods se = new SeMethods();

		//navigate to create lead page
		WebElement clickcreateLead=locateElement("link","Create Lead");
		click(clickcreateLead);

		//Passing value to someother fields
		WebElement companyName=locateElement("id","createLeadForm_companyName");
		type(companyName, comp);

		WebElement firstName=locateElement("id","createLeadForm_firstName");
		type(firstName, fs);


		WebElement lastname=locateElement("id","createLeadForm_lastName");
		type(lastname, ls);

		WebElement source=locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Direct Mail");

		//Enter country code
		WebElement country=locateElement("id", "createLeadForm_primaryPhoneCountryCode");
		type(country,"91");


		//enter phone number
		WebElement phoneNum=locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(phoneNum,"9884329058");
		//Click on find lead button
		WebElement button=locateElement("class","smallSubmit");
		click(button);
	}

	@DataProvider(name="CreateLead")
	public String [][] getData() 
	{

		/*Object[][] input=new Object[2][3];
		input[0][0]="Amazon";
		input[0][1]="Selva";
		input[0][2]="T";
		input[1][0]="TCS";
		input[1][1]="Avinash";
		input[1][2]="T";

		  return input;*/
		 	
		/*create instance object of readExcel class why because ReadExcel class 
		in another package*/
		ExcelDataProvider excel=new ExcelDataProvider();

		//call the  readExcelSheet method(this method came from ReadExcel class)
		String[][] values=excel.getExcelData("CreateLead");

		return values;

	}
}

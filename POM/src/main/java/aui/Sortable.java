package aui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	    driver.findElementByLinkText("Sortable").click();
	     WebElement demoframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demoframe);
		driver.findElementByXPath("//li[text()='Item 2']");
		driver.findElementByXPath("//li[text()='Item 5']");
		Actions builder = new Actions(driver);
		
		driver.findElementByXPath("//li[text()='Item 6']");
		builder.
		//List<String> ascorder = new ArrayList<String>();
		//Collections.sort();
      

	}

}

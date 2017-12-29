package webtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://erail.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("txtStationFrom").clear();
			driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
			driver.findElementById("txtStationTo").clear();
			driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
			List<WebElement> row = table.findElements(By.tagName("tr"));
			System.out.println(row.size());
			int size=row.size();
			List<String> item = new ArrayList<String>();
			for (int i = 0; i < size-1; i++) {
				if (row.get(i).findElements(By.tagName("td")).size()>0) {
					System.out.println(row.get(0).findElements(By.tagName("td")).get(1).getText());
				}
			}
			
			item.add(row.get(0).findElements(By.tagName("td")).get(1).getText());
			
			driver.findElementByLinkText("Train Name").click();
			
			Collections.sort(item);
			System.out.println(item);
			
			
	}

}

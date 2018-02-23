package webtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learnwebtable1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		int s = row.size();
		List<String> item = new ArrayList<String>();
		for (int i = 0; i < s-1; i++) {
			if (row.get(i).findElements(By.tagName("td")).size()>0) {
				//System.out.println(row.get(i).findElements(By.tagName("td")).get(1).getText());
				item.add(row.get(i).findElements(By.tagName("td")).get(1).getText());
			}
		}
		System.out.println(item);
		Collections.sort(item);
		System.out.println("After sorting/n" + item);
		//Thread.sleep(3000);

		driver.findElementByLinkText("Train Name").click();
		Thread.sleep(2000);
		WebElement tab = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> r = tab.findElements(By.tagName("tr"));
		
		List<String> ls = new ArrayList<String>();
		for (int i = 0; i < s-1; i++){			
			if (r.get(i).findElements(By.tagName("td")).size() >0) {
				System.out.println(r.get(i).findElements(By.tagName("td")).get(1).getText());
				ls.add(r.get(i).findElements(By.tagName("td")).get(1).getText());
			}
		}
		
		if(item.equals(ls)){
			System.out.println("matched");
		}else{
			System.out.println("Not matched");
		}
	}
}


package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://jqueryui.com/selectable/");		


		WebElement demo = driver.findElementByClassName("demo-frame");

		// switch to the frame
		driver.switchTo().frame(demo);
		//driver.findElementByLinkText("Selectable").click();
		WebElement item1=driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item5=driver.findElementByXPath("//li[text()='Item 5']");
		Actions builder=new Actions(driver);
		builder.clickAndHold(item1).release(item5).build().perform();



	}

}

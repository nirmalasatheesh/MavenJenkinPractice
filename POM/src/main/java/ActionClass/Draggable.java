package ActionClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
				driver.get("http://jqueryui.com/draggable/");
				driver.manage().window().maximize();
				
				WebElement demo = driver.findElementByClassName("demo-frame");
				
				// switch to the frame
				driver.switchTo().frame(demo);
				
				// Get the text of the draggable
				WebElement locate=driver.findElementById("draggable");
				System.out.println(locate.getLocation());
				
				Actions drag=new Actions(driver);
				drag.dragAndDropBy(locate,300,100).build().perform();
				
				// come out frame
				//driver.switchTo().defaultContent();
				


	}

}

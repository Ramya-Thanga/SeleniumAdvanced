package SeleniumAdvancedLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement From = driver.findElement(By.id("form:drag_content"));
		WebElement To = driver.findElement(By.id("form:drop_content"));

		Actions action = new Actions(driver);
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		action.dragAndDrop(From, To).build().perform();
	}

}

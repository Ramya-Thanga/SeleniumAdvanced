package SeleniumAdvancedLearning;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/list.xhtml");
		
		List <WebElement> element = driver.findElements(By.xpath("//*[@id=\'j_idt111\']/div/div[2]/ul/li"));
		WebElement fromElement = element.get(6);
		WebElement toElement = element.get(0);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();		

	}

}

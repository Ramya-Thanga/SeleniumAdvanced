package SeleniumAdvancedLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/list.xhtml");
		
		List<WebElement> SelectElement = driver.findElements(By.xpath("//*[@id=\'pickList\']/div[2]/ul/li"));
		
		int listsize = SelectElement.size();
		System.out.println("Number of elements in the list is " +listsize);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(SelectElement.get(0)).click(SelectElement.get(1))
		.click(SelectElement.get(2)).build().perform();  
		
		/*action.clickAndHold(SelectElement.get(0));
		action.clickAndHold(SelectElement.get(1));
		action.clickAndHold(SelectElement.get(2));
		action.build().perform();*/
		
		

		

	}

}

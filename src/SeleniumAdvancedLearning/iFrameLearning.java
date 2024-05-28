package SeleniumAdvancedLearning;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class iFrameLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01iz4on4g8ptksugxosotf1z8o275795.node0");
		
		driver.switchTo().frame(0);
		WebElement simpleIframe = driver.findElement(By.id("Click"));
		simpleIframe.click();
		
		String clickedText = driver.findElement(By.id("Click")).getText();
		System.out.println("The text inside the first iframe is " +clickedText);
		
		// Switching to the nested iframe
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalIframe = driver.findElements(By.tagName("iframe"));
		int size = totalIframe.size();
		
		System.out.println("Total number of iframes in this page " +size);

	}

}

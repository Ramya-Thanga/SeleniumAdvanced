package SeleniumAdvancedLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarpicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		WebElement getCalendar = driver.findElement(By.id("datepicker"));
		getCalendar.click();
		//getCalendar.sendKeys("04/10/2024");
		
		WebElement NextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		NextButton.click();
		
		Thread.sleep(2000);
		
		WebElement ClickCalendar = driver.findElement(By.xpath("//a[contains(text(),'30')]"));
		////*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[4]/a
		
		ClickCalendar.click();
		
		

	}

}

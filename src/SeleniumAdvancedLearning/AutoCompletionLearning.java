package SeleniumAdvancedLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.ca");
		
		WebElement SearchText = driver.findElement(By.name("q"));
		SearchText.sendKeys("Amazon");
		Thread.sleep(4000);
		
		List<WebElement> optionslist = driver.findElements(By.xpath("//*[@id=\'Alh6id\']/div[1]/div/ul/li"));
		
		
		int totalAutocompleteItems = optionslist.size();
	    System.out.println("size is " + totalAutocompleteItems);
		
		for (WebElement webelement : optionslist) {
	    	 if( webelement.getText().equals("amazon india")) {
	    	 webelement.click();
	    	 	break;
	    	 }
	    }
		
		

	}

}

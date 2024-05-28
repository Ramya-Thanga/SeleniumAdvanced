package SeleniumAdvancedLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		
		WebElement toDashboard = driver.findElement(By.linkText("Go to Dashboard"));
		toDashboard.click();
		
		driver.navigate().back();
		
		WebElement linkDestination = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/a"));
		String Destination = linkDestination.getAttribute("href");
		
		System.out.println("Destination link is " +Destination);
		
		
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		
	    String brokenPageTitle = driver.getTitle();
	    
	    if(brokenPageTitle.contains("404")) {
	    	System.out.println(" Broken Link");
	    	
	    }
		
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	List <WebElement> Links = driver.findElements(By.tagName("a"));
    	int countLinks = Links.size();
    	
    	System.out.println("Total links in this page is :" +countLinks);

		

	}

}

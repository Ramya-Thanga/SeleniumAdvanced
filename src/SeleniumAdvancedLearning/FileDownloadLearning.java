package SeleniumAdvancedLearning;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node04js89d8c9xcyjqdzpney1gjz328948.node0");
		
		WebElement clickDownload = driver.findElement(By.id("j_idt93:j_idt95"));
		WebDriverWait driverwait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driverwait.until(ExpectedConditions.elementToBeClickable(clickDownload));
		clickDownload.click();

		//"C:\Users\ramyp\Downloads"
		
		File fileLocation = new File("C:\\Users\\ramyp\\Downloads");
		
		File[] allFiles = fileLocation.listFiles();
		
		for (File file : allFiles) {
			if(file.getName().equals("TestLeaf Logo.png"))
			{
			System.out.println(" File found!!!");
			break;
			}
		}
		
		

	}

}

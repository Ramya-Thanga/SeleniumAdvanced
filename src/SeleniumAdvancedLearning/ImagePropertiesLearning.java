package SeleniumAdvancedLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagePropertiesLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		
		WebElement image1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img"));
		image1.click();
		
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'content\']/div/img[1]"));
		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Broken Image");
					}
		

	}

}

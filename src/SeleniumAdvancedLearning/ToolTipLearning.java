package SeleniumAdvancedLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		
		WebElement ToolTip = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[2]/a"));
		String ToolTipText = ToolTip.getAttribute("data-tooltip");
		
		System.out.println("The Tool Tip text is " +ToolTipText);

	}

}

package SeleniumAdvancedLearning;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WindowsAndTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node06ftl01ze027c1kvjys8bw636x271789.node0");		
		String oldWindow = driver.getWindowHandle();
		
		WebElement BtnWindow = driver.findElement(By.id("j_idt88:new"));
		BtnWindow.click();
		
		Set<String> handles= driver.getWindowHandles();
		
		for (String newWindows : handles) {
			driver.switchTo().window(newWindows);
						
		}
		
		WebElement alertChildWindow = driver.findElement(By.xpath("//*[@id=\'menuform:j_idt38\']/a"));
		alertChildWindow.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement openMulti = driver.findElement(By.id("j_idt88:j_idt91"));
		openMulti.click();
		
		Set<String> multiHandles = driver.getWindowHandles();
		int numberofMultiwindows = multiHandles.size();
		System.out.println("Number of windows open" + numberofMultiwindows);
		
		WebElement CloseAllButMe = driver.findElement(By.id("j_idt88:j_idt93"));
		CloseAllButMe.click();
		
		Set<String> multiWindows = driver.getWindowHandles();
		for (String childWindow : multiWindows) {
			
			if(!childWindow.equals(oldWindow)){
				driver.switchTo().window(childWindow);
				driver.close();
			}
			
		}
     driver.quit();				

	}

}

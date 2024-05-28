package SeleniumAdvancedLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumLearning\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.seleniumeasy.com/table-data-download-demo.html");
		
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/table"));
		
		List <WebElement> colCount = driver.findElements(By.tagName("th"));
		int countCol = colCount.size();
		
		System.out.println("Count of Columns in Table " +countCol);
		
		List <WebElement> rowCount = table.findElements(By.tagName("tr"));
		int countRow = rowCount.size();
		System.out.println("Count of Rows in Table " +countRow);
		
		WebElement getDateCol = table.findElement
		(By.xpath("//td[normalize-space()='Rhona Davidson']//following::td[4]"));
		System.out.println("Cell value next to Rhonda Davidson is " + getDateCol.getText());
		
		List<WebElement> rowValues = driver.findElements(By.xpath("//td[6]"));
		List<Integer> numberArray = new ArrayList<Integer>();
		for (WebElement webElement : rowValues) 
		{
			String individualValue =webElement.getText().replaceAll("[$,]","");
			
			numberArray.add(Integer.parseInt(individualValue));
		}
		System.out.println("final List " +numberArray);
		//int minSalary = Collection.min(numberArray);
		System.out.println("Minimum Salary in the table " + Collections.min(numberArray));
		System.out.println("testing " + Collections.max(numberArray));
		//System.out.println(Collections.sort(numberArray));
		
		WebElement canName = driver.findElement(By.xpath("//td[normalize-space()='$85,600']//preceding::td[5]"));
		System.out.println("The Name with Minimum Salary of " + Collections.min(numberArray) + " is " +canName.getText());
	}	

	}


